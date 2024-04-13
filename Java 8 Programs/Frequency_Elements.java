package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency_Elements
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Pen","Pencil","Rubber","Pen","Pencil","Pen","Sharpner");
		
		Map<String, Long> collect = 
				list.stream()
				.collect(Collectors.groupingBy
					(Function.identity(), Collectors.counting()));
		
		System.out.println(collect);
	}
}
