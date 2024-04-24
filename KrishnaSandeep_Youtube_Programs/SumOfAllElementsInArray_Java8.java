package com.KrishnaSandeep_Youtube_Programs;

import java.util.Arrays;

public class SumOfAllElementsInArray_Java8 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		int sum1 = Arrays
				.stream(arr)
				.reduce((x,y)->x+y)
				.getAsInt();
		System.out.println(sum1);
		
		int sum3 = Arrays
				.stream(arr)
				.reduce(Integer::sum)
				.getAsInt();
		System.out.println(sum3);
		
		long sum4 = Arrays
				.stream(arr)
				.summaryStatistics()
				.getSum();
		System.out.println(sum4);
	}
}
