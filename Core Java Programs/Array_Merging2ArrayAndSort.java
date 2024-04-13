package com.method;

import java.util.Arrays;

public class Array_Merging2ArrayAndSort
{
	public static void main(String[] args) 
	{
		int[] arr1= {100,10,20,30,40,50};
		int[] arr2= {99,88,77,66,55};
		
		int[] finalarr=new int[arr1.length+arr2.length];
		
		System.arraycopy(arr1, 0, finalarr, 0, arr1.length);
		
		System.arraycopy(arr2, 0, finalarr, arr1.length, arr2.length);
		
		Arrays.sort(finalarr);
		
		System.out.println("Merged Array and Sorted Array: ");
		for(int n:finalarr)
		{
			System.out.print(n+" ");
		}
	}
}
