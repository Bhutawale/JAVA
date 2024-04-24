package com.KrishnaSandeep_Youtube_Programs;

import java.util.Arrays;

public class SquareAndSortedArray_Java8 
{
	public static void main(String[] args) 
	{
		int[] arr= {-3,-2,-4,1,6,8,10,-5};
		Arrays.
		stream(arr)
		.map(n->n*n)
		.sorted()
		.forEach(System.out::println);
	}
}
