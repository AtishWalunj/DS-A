package com.demo;

import java.util.Scanner;

public class SearchData {

	public static void acceptData(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter number: "+(i+1));
			arr[i]=sc.nextInt();
		}
		
		
	}
	public static int linearSearch(int[] arr, int search) {
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==search)
				return i;
		}
		
		return -1;
	}
	public static int binarySearch(int[] arr, int search) {
		int start = 0;
		int end = arr.length-1;
		int compact=0;
		while(start<=end) {
		int mid = (start+end)/2;
		compact++;
		if(arr[mid]==search)
		{
			System.out.println("comparisons are "+ compact);
			return mid;
		}
		else if(arr[mid]<search) {
			start=mid+1;
		}
		else {
			end=mid-1;
		}
		}
		System.out.println("comparisons are "+ compact);
		return -1;
	}
	
	public static int binarySearchRecurssive(int start, int end, int search, int[] arr) {
		if(start>end)
			return -1;
		else {
			int mid=(start+end)/2;
			if(arr[mid]==search)
			{
				return mid;
			}
			else if(arr[mid]<search) {
				System.out.println(start+","+end+","+mid+","+search);
			    return binarySearchRecurssive(mid+1,end,search,arr);
			}else {
				System.out.println(start+","+end+","+mid+","+search);
				return binarySearchRecurssive(start, mid-1, search, arr);
			}
		}
		
		
	}
	public static void main(String[] args) {
		int n=10;
		int[] arr=new int [n];
		Scanner sc = new Scanner(System.in);
		acceptData(arr);
		System.out.println("Enter the number for search");
		
		int search = sc.nextInt();
		//int pos = linearSearch(arr,search);
		//int pos = binarySearch(arr,search);
		int pos=binarySearchRecurssive(0,arr.length,search,arr);
		if(pos!=-1)
		{
			System.out.println("Number found at pos"+ pos);
		}else
		{
			System.out.println("Number not found");
		}
		
	}
	

	
}
