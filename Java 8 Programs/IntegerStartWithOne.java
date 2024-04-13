package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;

public class IntegerStartWithOne
{
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,11,2,33,111,123,44);
		
		asList.stream().filter(n->n.toString().startsWith("1"))
		.forEach(System.out::println);
	}
}
