package com.KrishnaSandeep_Youtube_Programs;

import java.util.Arrays;

public class AddMultiplyAvgOfNumbers 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("Sum of all elements in array is: "+sum);
		
		double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println("Average of all numbers is: "+avg);
		
		int mul = Arrays.stream(arr).reduce((a,b)->a*b).getAsInt();
		System.out.println("Multiplication of all numbers: "+mul);
	}
}
