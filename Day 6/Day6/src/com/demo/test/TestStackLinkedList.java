package com.demo.test;

import com.demo.beam.StackLinkedList;

public class TestStackLinkedList {
             public static void main(String[] args) {
				String str="((({{}))";
				boolean flag=validateString(str);
				if(flag) {
					System.out.println("Balanced Paranthesis...");
					
				}
				else {
					System.out.println("Unbalanced Paranthesis...");
				}
			}

			private static boolean validateString(String str) {
				StackLinkedList ob=new StackLinkedList();
				for(int i=0;i<str.length();i++) {
					char ch=str.charAt(i);
					if(ch=='('|| ch=='{'||ch=='[') {
						ob.push(ch);
					}else {
						char ch1=ob.pop();
						if((ch==')'&& ch1!='(')||(ch=='}'&& ch1!='{')||(ch==']'&&ch1!='[')) {
							return false;
						}
					}
				}
				if(ob.isEmpty()) {
					return true;
				}
				
				return false;
			}
}
