package com.java8;

import java.util.Arrays;

public class MulValuesExceptCurrent 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,3,4,5};
		
		int totalMultiplication = Arrays.stream(arr).reduce(1, (a,b)->a*b);
		
		Arrays.stream(arr).forEach(num->System.out.println(totalMultiplication/num+" "));
	}
}
