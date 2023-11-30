package datastructure.bst;

public class MyBST {
	private BstNode root;

	public MyBST(int data) {
		this.root = new BstNode(data);
	}

	public void insert(int data) {
		insertNode(root, data);
	}

	public BstNode getRoot() {
		return root;
	}

	private BstNode insertNode(BstNode node, int data) {
		if (node == null) {
			return new BstNode(data);
		}
		if (data <= node.data) {
			node.left = insertNode(node.left, data);
		} else {
			node.right = insertNode(node.right, data);
		}
		return node;
	}

	public void inorderTraversal(BstNode node) {
		if (node == null)
			return;
		inorderTraversal(node.left);
		System.out.print(node.data + " ");
		inorderTraversal(node.right);
	}
}
