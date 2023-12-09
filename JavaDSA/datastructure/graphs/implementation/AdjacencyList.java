
package datastructure.graphs.implementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AdjacencyList {
	public static void main(String[] args) {
		int V = 15;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
		addEdge(adj, 0, 1);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 6);
		addEdge(adj, 6, 9);
		addEdge(adj, 6, 7);
		addEdge(adj, 0, 2);
		addEdge(adj, 0, 4);
		addEdge(adj, 2, 1);
		addEdge(adj, 4, 5);
		addEdge(adj, 7, 8);

		addEdge(adj, 10, 11);
		addEdge(adj, 10, 14);
		addEdge(adj, 10, 13);
		addEdge(adj, 11, 12);

		System.out.println(adj);
		print(adj);
		bfs(adj, V, 2);
		int ans = bfsDis(adj, V);
		System.out.println(ans);

		dfs(adj, V, 0);
		int c = dfsDisc(adj, V);
		System.out.println(c);
	}

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	static void print(ArrayList<ArrayList<Integer>> adj) {
		System.out.println("The adjancey graph is : ");
		for (int i = 0; i < adj.size(); i++) {
			System.out.print("\t" + i + " -> ");
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(adj.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

	static void bfs(ArrayList<ArrayList<Integer>> adj, int V, int s) {
		boolean[] isVisited = new boolean[V + 1];
		Queue<Integer> q = new LinkedList<>();
		System.out.println("The BFS : ");

		isVisited[s] = true;
		q.add(s);
		while (!q.isEmpty()) {
			int u = q.poll();
			System.out.print(u + " ");
			List<Integer> list = adj.get(u);
			for (int num : list) {
				if (!isVisited[num]) {
					isVisited[num] = true;
					q.add(num);
				}
			}
		}
		System.out.println();
	}

	static int bfsDis(ArrayList<ArrayList<Integer>> adj, int V) {
		boolean[] isVisited = new boolean[V];
		int count = 0;
		for (int i = 0; i < V; i++) {
			if (isVisited[i] == false) {
				bfs(adj, V, i, isVisited);
				count++;
			}
		}
		System.out.println();
		return count;
	}

	static void bfs(ArrayList<ArrayList<Integer>> adj, int V, int s, boolean[] isVisited) {
		Queue<Integer> q = new LinkedList<>();

		isVisited[s] = true;
		q.add(s);
		while (!q.isEmpty()) {
			int u = q.poll();
			System.out.print(u + " ");
			List<Integer> list = adj.get(u);
			for (int num : list) {
				if (!isVisited[num]) {
					isVisited[num] = true;
					q.add(num);
				}
			}
		}
	}

	static void dfs(ArrayList<ArrayList<Integer>> adj, int V, int s) {

		System.out.println("Start DFS");
		boolean[] isVisited = new boolean[V + 1];
		dfsHelper(adj, V, s, isVisited);
		System.out.println("\nEnd DFS");
	}

	static void dfsHelper(ArrayList<ArrayList<Integer>> adj, int V, int s, boolean[] isVisited) {
		if (isVisited[s])
			return;

		System.out.print(s + " ");
		isVisited[s] = true;

		ArrayList<Integer> nodeList = adj.get(s);
		for (int n : nodeList) {
			dfsHelper(adj, V, n, isVisited);
		}

	}

	static int dfsDisc(ArrayList<ArrayList<Integer>> adj, int V) {
		System.out.println("Start disconnected DFS");
		boolean[] isVisited = new boolean[V + 1];
		int count = 0;
		for (int i = 0; i < V; i++) {
			if (!isVisited[i]) {
				dfsHelper(adj, V, i, isVisited);
				count++;
			}
		}
		System.out.println("\nEnd disconnected DFS");
		return count;
	}

	static void shortestPath(ArrayList<ArrayList<Integer>> adj, int s, int V) {

	}

	static int shortestPathBetween(ArrayList<ArrayList<Integer>> adj, int s, int d, int V) {
		int shortestPath = 0;
		boolean[] isVisted = new boolean[V + 1];
		Queue<Integer> q = new LinkedList<>();

		isVisted[s] = true;
		q.add(s);
		while (!q.isEmpty()) {
			int n = q.poll();
			if (n == d)
				return shortestPath;

			ArrayList<Integer> children = adj.get(n);

			for (int i = 0; i < children.size(); i++) {
//				int val = children.
			}

		}

		return shortestPath;
	}

}
