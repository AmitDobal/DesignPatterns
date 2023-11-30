package datastructure.bst;

public class BstNode {
	int data;
	BstNode left;
	BstNode right;

	public BstNode(int data, BstNode left, BstNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public BstNode(int data) {
		this(data, null, null);
	}

	@Override
	public String toString() {
		return "BstNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}
