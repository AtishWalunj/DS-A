package beam;

public class BinarySearchTree {

	class Node{
		int data;
		Node left,right;
		public Node(int d) {
			data=d;
			left=null;
			right=null;
		}
	}
	private Node root;
	public BinarySearchTree() {
		root=null;
	}
	
	public void insert(int key) {
		root=insertRec(root,key);
	}

	private Node insertRec(Node root, int key) {
		
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key<root.data) {
			root.left=insertRec(root.left,key);
		}else {
			root.right=insertRec(root.right,key);
		}
		return root;
	}
	public void inorder() {
		inorderTraversal(root);
	}

	private void inorderTraversal(Node root) {
		
		if(root!=null) {
			inorderTraversal(root.left);
			System.out.print(root.data+",");
			inorderTraversal(root.right);
		}
	}
	public void preorder() {
		preorderTraverser(root);
	}

	private void preorderTraverser(Node root) {
		if(root!=null) {
			System.out.print(root.data+",");
		preorderTraverser(root.left);
		preorderTraverser(root.right);
		}
	}
	public void postorder() {
		postordertraverser(root);
	}

	private void postordertraverser(Node root) {
		if(root!=null) {
		postordertraverser(root.left);
		postordertraverser(root.right);
		System.out.print(root.data+",");
		}
		
	}
}
