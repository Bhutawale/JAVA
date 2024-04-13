package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength 
{
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","pear","banana","chikoo","grape");
		Map<Integer, List<String>> collect = list.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
	}
}
