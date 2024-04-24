package com.KrishnaSandeep_Youtube_Programs;

import java.util.Arrays;

public class SecondLargestElementInArray 
{
	public static int secondLargest(int[] arr)
	{
				
		Arrays.sort(arr);
		
		return arr[arr.length-2];
	
	}
	public static void main(String[] args)
	{
		int[] arr= {4,5,6,3,2,7,9,20,15};
		
		int secondLargest = secondLargest(arr);
		
		System.out.println(secondLargest);
	}
}
