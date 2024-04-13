package com.Java_8_Programs;

import java.util.function.Predicate;

public class Predicate_1 
{
	public static void main(String[] args)
	{
		Predicate<Integer> pr=t->(t>10);
		System.out.println(pr.test(100));
	}
}
