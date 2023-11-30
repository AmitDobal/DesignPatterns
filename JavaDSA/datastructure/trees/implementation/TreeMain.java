package datastructure.trees.implementation;

public class TreeMain {
	public static void main(String[] args) {
		
		MyTree tree1 = new MyTree(10);
		tree1.root.left = new TreeNode(20);
		tree1.root.right = new TreeNode(30, new TreeNode(400, new TreeNode(60), new TreeNode(70)),
				new TreeNode(50, new TreeNode(80)));
		
		MyTree tree2 = new MyTree(10);
		tree2.root.left = new TreeNode(50);
		tree2.root.right = new TreeNode(60, new TreeNode(70, null, new TreeNode(80)),
				new TreeNode(20));
		
		MyTree tree3 = new MyTree(10);
		tree3.root.right = new TreeNode(50, new TreeNode(60, null, new TreeNode(10)),
				new TreeNode(20));
		
		MyTree tree4 = new MyTree(10);
		tree4.root.left = new TreeNode(30, new TreeNode(400, new TreeNode(60), new TreeNode(70)),
				new TreeNode(50, new TreeNode(80)));
		tree4.root.right = new TreeNode(30, new TreeNode(400, new TreeNode(60), new TreeNode(30, new TreeNode(400, new TreeNode(60), new TreeNode(70)),
				new TreeNode(50, new TreeNode(80)))),
				new TreeNode(50, new TreeNode(30, new TreeNode(400, new TreeNode(60), new TreeNode(70)),
						new TreeNode(50, new TreeNode(80)))));
		
		MyTree tree5 = new MyTree(20);
		tree5.root.left = new TreeNode(8,new TreeNode(3),new TreeNode(5));
		tree5.root.right = new TreeNode(12);
		
		
		
		
		MyTree tree = tree5;

		System.out.println("Inorder: ");
		tree.printInorder(tree.root);
		System.out.println();

		System.out.println("PreOrder: ");
		tree.printPreorder(tree.root);
		System.out.println();

		System.out.println("PostOrder: ");
		tree.printPostorder(tree.root);
		System.out.println();

		System.out.println("Height of the Tree: " + tree.height(tree.root));

		System.out.println("Print k distance: ");
		tree.printKDist(tree.root, 3);
		System.out.println();

		System.out.println("Level Order traversal: ");
		tree.printLevelOrder();
		System.out.println();
		
		System.out.println("Level Order traversal Line By Line: ");
		tree.printLevelOrderByLine2();
		System.out.println();
		
		System.out.print("Size of the tree: " + tree.size(tree.root));
		System.out.println();
		
		System.out.print("Max Value of the tree: " + tree.maxValue(tree.root));
		System.out.println();
		
		System.out.print("Left view: ");
		tree.printLeftView();
		System.out.println();
		
		System.out.print("Left view Recursively: ");
		tree.printLeftViewRecursive();
		System.out.println();
		
		System.out.print("Children sum property: ");
		System.out.println(tree.childrenSum(tree.root));
		
		
	}
}
