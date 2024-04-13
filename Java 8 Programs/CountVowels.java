package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;

public class CountVowels 
{
	public static void main(String[] args) 
	{
		String str="Hello world Java Programming language";
		
		String string = str.toLowerCase();
		
		List<Character> list = Arrays.asList('a','e','i','o','u');
		
		long count = string
				.chars()
				.mapToObj(c->(char)c)
				.filter(list::contains)
				.count();
		
		System.out.println(count);
	}
}
