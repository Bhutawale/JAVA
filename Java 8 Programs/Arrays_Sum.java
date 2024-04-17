package com.Java_8_Programs;

import java.util.Arrays;

public class Arrays_Sum
{
	public static void main(String[] args) 
	{
		int[] arr= {2,3,4,5,7};
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("Sum of elements in an array is: "+sum);
	}
}
