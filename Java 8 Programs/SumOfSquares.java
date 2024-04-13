package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquares 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		int sum = list.stream()
		.map(n->n*n)
		.collect(Collectors.summingInt(n->n)).intValue();

		System.out.println("Sum of squares of given numbers is: "+sum);
		
		int sum2 = list.stream().mapToInt(n->n*n).sum();
		
		System.out.println(sum2);
	}
}
