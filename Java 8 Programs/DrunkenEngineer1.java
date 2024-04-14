package com.Java_8_Programs;

import java.util.Arrays;

public class DrunkenEngineer1 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		int reduce = Arrays.stream(arr).reduce(1, (a,b)->a*b);
		
		System.out.println(reduce);
	}
}
