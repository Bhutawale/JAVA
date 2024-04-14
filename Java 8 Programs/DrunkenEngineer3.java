package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DrunkenEngineer3 
{
	public static void main(String[] args) 
	{
		String str="Hello World";
		String string = str.toLowerCase();
		
		List<Character> list = Arrays.asList('a','e','i','o','u');
		
		long count = string.chars().mapToObj(c->(char)c).filter(list::contains).count();
		
		System.out.println(count);
		
		List<Character> collect = string.chars().mapToObj(c->(char)c).filter(list::contains).collect(Collectors.toList());
		System.out.println("Vowels in given String: "+collect);
		
		System.out.println("------------");
		
		List<Character> collect2 = string.chars().mapToObj(c->(char)c).distinct().collect(Collectors.toList());
		
		System.out.println(collect2);
		
		System.out.println("-------------");
		
		Map<String, Long> collect3 = 
				string.
				chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.
						groupingBy(Object::toString,
								Collectors.counting()));
		System.out.println(collect3);
	}
}
