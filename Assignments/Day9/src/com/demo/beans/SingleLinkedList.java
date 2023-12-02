package com.demo.beans;

public class SingleLinkedList {
             private Node head;
             class Node{
            	 int n;
            	 Node next;
            	 Node(int d){
            		 n=d;
            		 next=null;
            	 }
             }
             public SingleLinkedList() {
            	 head=null;
             }
             public void addatstart(int value) {
            	 //create node
            	 Node newnode=new Node(value);
            	 if(head==null) {
            		 head=newnode;
            	 }
            	 else {
            		 newnode.next=head;
            		 head=newnode;
            	 }
             }
			public void displaydata() {
				Node temp=head;
				while(temp!=null) {
					System.out.print(temp.n+",");
					temp=temp.next;
				}
				System.out.println();
			}
			public void removeBYKey(int val) {
				 if(head==null) {
	        		 System.out.println("list is empty");
	        	 }
	        	 else {
	        		 //delete from the begining
	        		 if(head.n==val) {
	        			 Node temp=head;
	        			 head=head.next;
	        			 //it will make the temp ready for garbage collection
	        			 temp.next=null;
	        			
	        		 }else {
	        			 Node prev=head;
	        			 Node current=prev.next;
	        			 while(current!=null&&current.n!=val) {
	        				 prev=prev.next;
	        				 current=current.next;
	        			 }
	        			 if(current!=null) {
	        				 prev.next=current.next;
	        				 current.next=null;
	        				 current=null;
	        				
	        			 }else {
	        				 System.out.println(val+"not found...");
	        			
	        			 }
	        		 }
				
	        	 }
				
			//	return val;
}
}