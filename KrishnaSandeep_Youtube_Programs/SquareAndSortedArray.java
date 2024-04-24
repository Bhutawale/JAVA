package com.KrishnaSandeep_Youtube_Programs;

import java.util.Arrays;

public class SquareAndSortedArray 
{
	public static int[] squareAndSorted(int[] arr)
	{
		int[] square=new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			square[index]=arr[i]*arr[i];
			index++;
		}
		Arrays.sort(square);
		return square;
	}
	public static void main(String[] args) 
	{
		int[] arr= {-1,3,4,5,-2,-6};
		int[] squareAndSorted = squareAndSorted(arr);
		for(int n:squareAndSorted)
			System.out.println(n);
	}
}
