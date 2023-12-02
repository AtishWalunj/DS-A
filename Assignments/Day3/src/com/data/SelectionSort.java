package com.data;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {65,34,52,1,23,91};
		System.out.println(Arrays.toString(arr));
		selectionsort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionsort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<n;j++)
				
			{
				if(arr[j]<arr[min_idx])
				{
					min_idx=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
		}
	}
}
