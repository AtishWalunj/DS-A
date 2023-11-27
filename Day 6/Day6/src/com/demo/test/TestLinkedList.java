package com.demo.test;

import com.demo.beam.SingleLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		SingleLinkedList ob = new SingleLinkedList();
		ob.addAtEnd(10);
		ob.addAtEnd(11);
		ob.addByPosition(12, 1);
		ob.addByPosition(13, 4);
		ob.displayData();
		ob.deleteByValue(18);
		
		ob.displayData();
	}
}
