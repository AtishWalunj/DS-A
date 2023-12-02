package com.demo.beam;

public class StackLinkedList {
          private Node top;
          class Node{
        	  char num;
        	  Node next;
			public Node(char num) {
				super();
				this.num = num;
				next=null;
			}
        	  
          }
		public StackLinkedList() {
			super();
			this.top = null;
		}
		public boolean isEmpty() {
			return top==null;
		}
		
		public void push(char n) {
			Node newnode=new Node(n);
			if(top!=null) {
				newnode.next=top;
			}
			top=newnode;
		}
		
		public char pop() {
			if(top==null) {
				System.out.println("Stack is Empty,UNDERFLOW");
			}
			Node temp=top;
			top=top.next;
			//it will make it ready for garbage collection
			temp.next=null;
			return temp.num;
		}
          
}
