package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveStringFromList
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("apple","banana","cherry","date","grape");
		
		List<String> collect = list.stream()
				.filter(s->!s.contains("an"))
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
