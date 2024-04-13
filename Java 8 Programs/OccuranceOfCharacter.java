package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfCharacter 
{
	public static void main(String[] args) 
	{
		String str="ilovesanskar";
		Map<String, List<String>> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(s->s));
		System.out.println(collect);
		
	}
}
