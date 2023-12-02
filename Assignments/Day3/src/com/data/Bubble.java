package com.data;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		
		int[] arr = {23,54,44,3,56,2};
		System.out.println(Arrays.toString(arr));
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubblesort(int[] arr) {
		int i,j;
		int temp=0;
		boolean flag;
		int n=arr.length;
		
		for(i=0;i<n;i++)
		{
			
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					//System.out.println("gsdfg");
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				
				}
			}
			
			
			 
		}
		
		
	}
}
