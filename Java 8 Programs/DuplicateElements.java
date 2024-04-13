package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElements 
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,2,3,4,4,5,5,6);
		
		List<Integer> collect = list.stream()
				.distinct().collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
