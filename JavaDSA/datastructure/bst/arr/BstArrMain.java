package datastructure.bst.arr;

public class BstArrMain {
	public static void main(String[] args) {
		int[] a = { 10, 5, 20, 3, 8, 15, 25 };
		MyBstArrs bst = new MyBstArrs(a);
		
		System.out.println(bst.getRoot());
		System.out.println(bst.getLeftChild(2));
		System.out.println(bst.getRightChild(2));
	}

}
