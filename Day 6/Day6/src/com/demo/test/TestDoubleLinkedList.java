package com.demo.test;

import com.demo.beam.DoublyLinkedList;

public class TestDoubleLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList ob = new DoublyLinkedList();
		ob.addAtEnd(13);
		ob.addAtEnd(12);
		ob.addAtEnd(11);
		ob.addAtEnd(10);
		System.out.println("-----dispaly function-----");
		ob.displayData();
		ob.addAtPosition(14, 1);
		ob.addAtPosition(9, 4);
		System.out.println("-----dispaly function-----");
		ob.displayData();
		ob.deleteByKey(14);
		ob.deleteByKey(9);
		System.out.println("-----dispaly function-----");
		ob.displayData();
		ob.addAfterKey(11);
		System.out.println("-----dispaly function-----");
		ob.displayData();
		
	
	}
	
}
