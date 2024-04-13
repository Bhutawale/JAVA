package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersFromList 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10,3,4,2,8,1,5,7,9,50);
		
		List<Integer> even_numbers = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(even_numbers);

	}
}
