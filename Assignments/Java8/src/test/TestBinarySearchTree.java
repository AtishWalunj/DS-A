package test;

import beam.BinarySearchTree;

public class TestBinarySearchTree {
   public static void main(String[] args) {
	   BinarySearchTree bst=new BinarySearchTree();
	   bst.insert(60);
	   bst.insert(35);
	   bst.insert(75);
	   bst.insert(40);
	   bst.insert(20);
	   bst.insert(70);
	   bst.insert(85);
	   System.out.println("-----Inorder------");
	   bst.inorder();
	   System.out.println("\n-----preorder-----");
	   bst.preorder();
	   System.out.println("\n-----postorder-----");
	   bst.postorder();
}
}
