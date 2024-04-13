package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_String_ByLength 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("CPP","Java","C","Html","Python","Hibernate");
		
		List<String> collect = list.stream()
				.sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}
	
}
