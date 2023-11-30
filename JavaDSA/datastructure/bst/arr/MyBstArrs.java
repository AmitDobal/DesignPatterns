package datastructure.bst.arr;

public class MyBstArrs {
	private int[] bstArr;
	
	public MyBstArrs(int[] arr) {
		bstArr = arr;
	}
	
	public int getRoot() {
		if(bstArr == null) {
			System.out.println("BST is empty");
			return -1;
		}
		return bstArr[0];
	}
	
	public int getLeftChild(int index) {
		int childIdx = index * 2 + 1;
		if(childIdx >= bstArr.length ) {
			System.out.print("No Left child: ");
			return -1;
		}
		return bstArr[childIdx];
	}
	public int getRightChild(int index) {
		int childIdx = index * 2 + 2;
		if(childIdx >= bstArr.length ) {
			System.out.print("No right child: ");
			return -1;
		}
		return bstArr[childIdx];
	}
}
