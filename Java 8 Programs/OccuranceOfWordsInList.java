package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;

public class OccuranceOfWordsInList 
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("apple","banana","apple","cherry","apple");
		
		long count = list.stream()
				.filter(s->s.contentEquals("apple")).count();
		System.out.println(count);
	}
}
