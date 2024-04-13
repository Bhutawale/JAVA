package com.Java_8_Programs;

import java.util.Arrays;


public class Sum_Avg
{
	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40,50};
		
		int sum = Arrays.stream(arr).sum();
		
		System.out.println(sum);
		
		double avg = Arrays.stream(arr).average().getAsDouble();
		
		System.out.println(avg);
	}
}
