package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class String_GroupWordsByLength 
{
	public static void main(String[] args) {
		String str="Hello World hi my name is satish";
		String[] split = str.split(" ");
		List<String> list = Arrays.asList(split);
		Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
	}
}
