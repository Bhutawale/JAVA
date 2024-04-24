package com.KrishnaSandeep_Youtube_Programs;

import java.util.Arrays;

public class RemoveDuplicateChar_Java8 
{
	public static void main(String[] args) 
	{
		String str="satish";
		
		Arrays
		.stream(str.split(""))
		.distinct()
		.forEach(System.out::print);
	}
}
