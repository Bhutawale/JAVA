package com.java8;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		String[] strArr= {"apple","mango","chikoo","apple","pineapple","mango"};
		
		Arrays.stream(strArr).distinct().forEach(System.out::println);
		
		System.out.println("------------------");
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(Arrays.asList(strArr));
		linkedHashSet.forEach(System.out::println);;
		
	}
}
