package com.demo.beam;

import java.util.Arrays;



public class QueueLinkedList {
	Node front,rear;
	class Node{
		int num;
		Node next;
		public Node(int num) {
			super();
			this.num = num;
			next=null;
		}
		
		
	}
	public QueueLinkedList() {
		super();
		front=null;
		rear=null;
	}
	
	public boolean isEmpty() {
		return front==null && rear==null;
	}
	public void enqueue(int n) {
		Node newnode=new Node(n);
		if(isEmpty()) {
			front=newnode;
		}else {
			rear.next=newnode;
		}
		rear=newnode;
	}
	
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("the queue is empty");
			return -1;
		}
		else {
			Node temp=front;
			front=front.next;
			temp.next=null;
			return temp.num;
			
		}
	}

	@Override
	public String toString() {
		return "QueueLinkedList [front=" + front.num + ", rear=" + rear.num + "]";
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("no element to show");
			
		}
		else {
			Node temp=front;
			
			while(temp!=null) {
				System.out.print(temp.num );
				temp=temp.next;
				if(temp!=null) {
				System.out.print("-->");}
			}
			System.out.println("\n");
		}
	}
	
	
}
