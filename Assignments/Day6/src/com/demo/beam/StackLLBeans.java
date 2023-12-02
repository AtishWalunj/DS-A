package com.demo.beam;

public class StackLLBeans {
	
	private Node top;
	class Node{
		int num;
		Node next;
		public Node(int i) {
			super();
			num=i;
			next=null;
		}
		
	}
	public StackLLBeans() {
		super();
		top=null;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	public void push(int i) {
		Node newnode=new Node(i);
		if(top!=null) {
			newnode.next=top;
		}
		top=newnode;
		
	}
	public int pop() {
		if(top==null) {
			System.out.println("stack is empty,underflow");
		}
		Node temp=top;
		top=top.next;
		//it will make it ready for garbage collection
		temp.next=null;
		return temp.num;
		
		
	}

}
