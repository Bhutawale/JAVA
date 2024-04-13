package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWith
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,2,112,113,111,4,566,6);
		
		list.stream().map(n->n+"").filter(n->n.startsWith("1"))
		.forEach(System.out::println);
	}
}
