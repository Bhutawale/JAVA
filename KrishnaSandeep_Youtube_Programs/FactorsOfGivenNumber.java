package com.KrishnaSandeep_Youtube_Programs;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfGivenNumber 
{
	public static List<Integer> factors(int num)
	{
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				list.add(i);
			}
		}
		return list;
	}
	public static void main(String[] args) 
	{
		int num=8;
		List<Integer> factors = factors(num);
		System.out.println("Factors of a given number are: ");
		factors.stream().forEach(System.out::println);
	}
}
