package com.method;

import java.util.Arrays;

public class Array_SquareSortedElements 
{
	public static void main(String[] args) 
	{
		int[] arr= {-1,0,4,2,-5};
		
		int[] newarr= new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			newarr[i]=arr[i]*arr[i];
		}
		Arrays.sort(newarr);
		System.out.println("Sorted and Sqaured elements: ");
		for(int k:newarr)
		{
			System.out.print(k+" ");
		}
	}
}
