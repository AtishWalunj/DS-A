package test;

import java.util.Scanner;

import beans.SingleLinkedList;

public class TestHashing {
          public static void main(String[] args) {
			SingleLinkedList[] hashtab=new SingleLinkedList[5];
			for(int i=0;i<hashtab.length;i++) {
				hashtab[i]=new SingleLinkedList();
			}
			int[] arr= {25,12,14,45,1,3,8,9};
			for(int i=0;i<arr.length;i++) {
				int pos=arr[i]%hashtab.length;
				hashtab[pos].addatstart(arr[i]);
			}
			for(int i=0;i<hashtab.length;i++) {
				hashtab[i].displaydata();
			}
			int searchnum;
			System.out.println("Enter the to search:");
			Scanner sc=new Scanner(System.in);
			searchnum=sc.nextInt();
			int pos=searchnum%hashtab.length;
			System.out.println("search num position :"+pos);
			if(hashtab[pos].search(searchnum)) {
				System.out.println("number exists at Index:"+searchnum);
			}else {
				System.out.println("number does not exists...");
			}
			
		}
}
