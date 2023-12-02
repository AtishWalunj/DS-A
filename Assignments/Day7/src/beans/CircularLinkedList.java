package beans;

public class CircularLinkedList {

	class Node{
		int data;
		Node next;
		public Node(int n) {
			data=n;
			next=null;
		}
	}
	private Node head;
	public CircularLinkedList() {
		head=null;
	}
	public void addnodeByPosition(int pos,int value) {
		Node newnode = new Node(value);
		if(head==null) {
			head=newnode;
			newnode.next=head;
		}
		else {
			if(pos==1) {
				Node temp=head;
				newnode.next=head;
				head=newnode;
				temp.next=head;
			}
			else {
				Node temp=head;
				int i;
				for(i=1;temp.next!=head && i<=pos-2;i++) {			
						temp=temp.next;
				}
				newnode.next=temp.next;
				temp.next=newnode;
				
			}
		}
	}
	public void deleteBykey(int n) {
		Node prev=null;
		Node current=head;
		while(current.next!=head && current.data!=n) {
			
			prev=current;
			current=current.next;
		}
		if(current.data==n) {
			if(current==head) {
				Node temp=current;
				while(temp.next!=head) {
					temp=temp.next;
				}
				temp.next=current.next;
				head=head.next;
				current.next=null;
				current=null;
			}
			else {
				prev.next=current.next;
				current.next=null;
				current=null;
			}
		}
	}
	public void displaydata() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
}
