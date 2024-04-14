package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DrunkenEngineer4 
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,2,3,5,5,6,7,7,8,3,1);
		
		Map<Integer, Long> collect = list.stream()
				.collect(Collectors.groupingBy
						(Integer::intValue,
								Collectors.counting()));
		
		System.out.println(collect);
		
		
		List<String> list2 = Arrays.asList("apple","banana","apple","chikoo","chikoo","pear","banana","pear","guava");
		
		Map<String, Long> collect2 = list2.stream()
				.collect(Collectors.
						groupingBy(s->s,
								Collectors.counting()));
		
		System.out.println(collect2);
		
	}
}
