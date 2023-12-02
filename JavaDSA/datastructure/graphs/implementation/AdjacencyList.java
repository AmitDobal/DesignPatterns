
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
		bfsDis(adj, V);
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

	static void bfsDis(ArrayList<ArrayList<Integer>> adj, int V) {
		boolean[] isVisited = new boolean[V];

		for (int i = 0; i < V; i++) {
			if (isVisited[i] == false) {
				bfs(adj, V, i, isVisited);
			}	
		}
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
}
