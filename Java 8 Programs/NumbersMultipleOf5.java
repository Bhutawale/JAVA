package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;

public class NumbersMultipleOf5 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(25,45,43,23,20,65,67,89);
		
		list.stream().filter(n->n%5==0).forEach(System.out::println);
	}
}
