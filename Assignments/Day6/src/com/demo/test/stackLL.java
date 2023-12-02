package com.demo.test;

import com.demo.beam.StackLLBeans;


public class stackLL {
	public static void main(String[] args) {
		StackLLBeans ob=new StackLLBeans();
		ob.push(12);
		ob.push(34);
		ob.push(55);
		ob.push(52);
		ob.push(53);
		ob.push(51);
		ob.pop();
		while(!ob.isEmpty())
		   System.out.print(ob.pop()+" "); 

	}
}
