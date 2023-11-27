package com.demo.beam;

import com.demo.beam.SingleLinkedList.Node;

public class DoublyLinkedList {
	Node head;
	class Node{
		int num;
		Node prev;
		Node next;
		public Node(int num) {
			super();
			this.num = num;
			prev=null;
			next=null;
		};
		
	}
	public DoublyLinkedList() {
		super();
		head=null;
	}
	public void addAtEnd(int n) {
		Node newnode=new Node(n);
		//if list is empty 
		if(head==null) {
			head=newnode;
		}
		//if list is not empty
		else {
			Node temp=head;
			//move temp to the last node
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
		}
	}
	
	public void addAtPosition(int val,int pos){
		Node newnode=new Node(val);
		if(pos==1) {
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}else {
		Node temp=head;
		//this will place temp to the node after which we want to add
		for(int i=1;temp!=null && i<=pos-2;i++) {
			temp=temp.next;
		}
		if(temp!=null) {
			newnode.next=temp.next;
			newnode.prev=temp;
			temp.next.prev=newnode;
			temp.next=newnode;
			
		}
		else {
			System.out.println("wrong position");
		}
		}
	}
	
	//public void addBeforeKey(int num)
	//public void addAfterKey(int num)
	
	public int deleteByKey(int num) {
		Node current=head;
		while(current!=null && current.num!=num) {
			current=current.next;
		}
		if(current!=null) {
			//delete the node from the begining
			if(current==head) {
				head=head.next;
				head.prev=null;
				current.next=null;
				current=null;
				return num;
			}//delete from  in between
			else {
				current.prev.next=current.next;
				if(current.next!=null) {
				    current.next.prev=current.prev;
				    current.next=null;
				}
				current.prev=null;
				current=null;
				return num;
				
			}
		}
		return -1;
	}
	public int addAfterKey(int val){
		Node newnode=new Node(val);
		Node current=head;
		while(current!=null && current.num!=val) {
			current=current.next;
		}
		if(current!=null) {
			//delete the node from the begining
			if(current==head) {
				
				newnode.next=head;
				head.prev=newnode;
				head=newnode;
				return val;
			}//delete from  in between
			else {
				
				
				newnode.next=current.next;
				newnode.prev=current;
				current.next.prev=newnode;
				current.next=newnode;
				
				return val;
				
			}
		}
		return -1;
		
	}
	
	public void displayData() {
		Node temp=head;
		while(temp!=null) {
			System.err.println(temp.num);
			temp=temp.next;
		}

}
}
