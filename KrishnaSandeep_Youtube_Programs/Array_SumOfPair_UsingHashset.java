package com.programs;

import java.util.HashSet;
import java.util.Set;

public class Array_SumOfPair_UsingHashset 
{
	static void sumOfPair(int[] arr,int target)
	{
		Set<Integer> set=new HashSet<Integer>();
		
		for(int n:arr)
		{
			int complement=target-n;
			if(set.contains(complement))
			{
				System.out.println("["+n+" + "+complement+"]"+" = "+target);
			}
			set.add(n);
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {2, 7, 4, -5, 11, 5, 20};
		int target=15;
		sumOfPair(arr,target);
	}
}
