package com.java8;

import java.util.Arrays;

public class SecondSmallestElementInArray 
{
	public static void main(String[] args) 
	{
		int[] arr= {8,5,3,2,1,7,1}; // 2
		int min = Arrays.stream(arr).sorted().min().getAsInt();
		System.out.println(min);
		
		int max = Arrays.stream(arr).sorted().max().getAsInt();
		System.out.println(max);
		
		double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println(avg);
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		int secondLargestNum=Arrays.stream(arr).distinct().sorted().skip(1).findFirst().getAsInt();
		System.out.println(secondLargestNum);
	}
}
