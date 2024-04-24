package com.KrishnaSandeep_Youtube_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateStrings 
{
	public static void duplicates(String[] arr)
	{
		Set<String> set=new HashSet<>();
		List<String> dup=new ArrayList<String>();
		List<String> list = Arrays.asList(arr);
		for(String s:list)
		{
			if(set.contains(s))
			{
				dup.add(s);
			}
			else
			{
				set.add(s);
			}
		}
		System.out.println("Printing duplicate Strings:");
		for(String s:dup)
			System.out.println(s);
		
		System.out.println("Printing Set with no duplicates: ");
		for(String st:set)
			System.out.println(st);
	}
	public static void main(String[] args) 
	{
		String[] arr= {"apple","mango","coconut","apple","chikoo","mango"};
		duplicates(arr);
	}
}
