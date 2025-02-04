package com.java8;

import java.util.Arrays;

public class CommonElementInArray 
{
	public static void main(String[] args) 
	{
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {2,3,4,7,8,9};
		
		Arrays.stream(arr1)
			.filter(num->Arrays.stream(arr2).anyMatch(arr2Num->arr2Num==num))
			.forEach(System.out::println);
	}
}
