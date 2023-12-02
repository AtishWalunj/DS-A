package test;

import beans.CircularLinkedList;

public class TestCircularLL {

	public static void main(String[] args) {
		CircularLinkedList ob = new CircularLinkedList();
		ob.addnodeByPosition(1, 10);
		ob.addnodeByPosition(2, 13);
		ob.addnodeByPosition(2, 25);
		ob.addnodeByPosition(4, 34);
		ob.addnodeByPosition(4, 3);
//		ob.addnodeByPosition(8, 34);//abnormal conditons
//		ob.addnodeByPosition(7, 4);
		ob.deleteBykey(10);
		ob.displaydata();
	}
}
