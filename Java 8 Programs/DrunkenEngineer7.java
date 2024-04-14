package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DrunkenEngineer7 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("apple","banana","apple","cake","cake");
		
		Map<String, Long> collect = 
				list
				.stream()
				.collect(Collectors.groupingBy
						(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		Map<String, Long> collect2 = 
				collect
				.entrySet()
				.stream()
				.filter(x->x.getValue()>1)
				.collect(Collectors.toMap(
						Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(collect2);
			
	}
}
