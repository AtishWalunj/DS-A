package com.demo.test;

import com.demo.beam.QueueLinkedList;

public class TestQueueUsingLL {
	public static void main(String[] args)
    {
		QueueLinkedList ob=new QueueLinkedList();
  	  ob.enqueue(10);
  	  ob.enqueue(11);
  	  ob.enqueue(12);
  	  ob.enqueue(13);
  	  ob.enqueue(14);
  	  System.out.println(ob);
  	  ob.display();
  	  ob.enqueue(15);
  	  ob.dequeue();
  	  System.out.println(ob);
  	  ob.display();
  	  ob.dequeue();
  	  ob.dequeue();
  	  ob.dequeue();
  	  ob.dequeue();
  	  System.out.println(ob);
  	  ob.display();
  	  ob.dequeue();
    }
}
