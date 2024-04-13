package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;

public class Array_DivisibleByNumber 
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,5,2);
		
		boolean match = list.stream().allMatch(n->n%2==0);
		
		if(match==true)
		{
			System.out.println("All numbers are divisible by 2");
		}
		else
		{
			System.out.println("All numbers are not divisible by 2");
		}
		
		boolean match2 = list.stream().anyMatch(n->n%2==0);
		
		if(match2==true)
		{
			System.out.println("Atleast one number is divisible by 2");
		}
		else
		{
			System.out.println("No number is divisible by 2");
		}
	}
}
