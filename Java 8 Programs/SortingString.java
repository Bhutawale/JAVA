package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingString 
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("banana","apple","dates","grapes","cherry");
		
		List<String> sort_asc = list.stream()
				.sorted(Comparator.comparing(s->s))
				.collect(Collectors.toList());
		
		System.out.println(sort_asc);
		
		List<String> collect = list.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = list.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(collect2);
	}
}
