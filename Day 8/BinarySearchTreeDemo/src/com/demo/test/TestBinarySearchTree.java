package com.demo.test;

import com.demo.beans.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree ob=new BinarySearchTree();
		/*       60
		 *      /   \
		 *     35    75
		 *    /  \   / \
		 *   20  40 70  85
		 * 
		 * 
		 */
		// bst.insert(60);
		// bst.insert(35);
		// bst.insert(75);
		// bst.insert(40);
		// bst.insert(20);
		// bst.insert(70);
		// bst.insert(60);
		ob.insert(10);
		ob.insert(20);
		ob.insert(90);
		ob.insert(40);
		ob.insert(150);
		ob.insert(200);
		System.out.println("Inorder");
		ob.inorder();
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Preorder");
		ob.preorder();
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Postorder");
		ob.postorder();
	}

}
