package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashMap;
import java.util.Map;

public class CountEvenOdd 
{
	public static Map<String,Integer> countEvenOdd(int num)
	{
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		int countEven=0;
		int countOdd=0;
		
		while(num>0)
		{
			int n=num%10;
			if(n%2==0)
				countEven++;
			else
				countOdd++;
			num=num/10;
		}
		map.put("Even", countEven);
		map.put("Odd", countOdd);
		return map;
	}
	public static void main(String[] args) 
	{
		int num=12345678;
		Map<String, Integer> countEvenOdd = countEvenOdd(num);
		countEvenOdd.entrySet().stream().forEach(System.out::println);
	}
}
