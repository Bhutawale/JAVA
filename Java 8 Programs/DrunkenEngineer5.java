package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;

public class DrunkenEngineer5 
{
	public static void main(String[] args) 
	{
		Integer[] arr= {12,16,45,11,18,22,19,20,45};
		
		Integer secondHighest =Arrays
				.stream(arr)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(secondHighest);
	}
}
