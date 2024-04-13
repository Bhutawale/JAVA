package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_StartWithLetter 
{
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","anjir","banana","cherry","chikoo");
		
		list.stream()
		.filter(s->s.startsWith("a"))
		.forEach(System.out::println);;
		
		List<String> collect = list.stream().filter(s->s.startsWith("c")).collect(Collectors.toList());
		System.out.println(collect);
	}
}
