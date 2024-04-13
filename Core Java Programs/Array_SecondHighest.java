package com.method;

import java.util.Arrays;

public class Array_SecondHighest 
{
	public int second(int[] arr)
	{
		int s_highest=0;
		Arrays.sort(arr);
		s_highest=arr.length-1;
		return s_highest;
	}
	public static void main(String[] args) 
	{
		int[] arr=new int[] {1,2,3,4,5};
		System.out.println("Original Array: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Array_SecondHighest sh=new Array_SecondHighest();
		int second = sh.second(arr);
		System.out.println("Second Highest element in array is: "+second);
	}
}
