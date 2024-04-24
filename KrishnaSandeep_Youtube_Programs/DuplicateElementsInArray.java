package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray 
{
	public static void duplicates(int[] arr)
	{
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
				System.out.println(arr[i]);
			else
				set.add(arr[i]);
		}
		
	}
	public static void main(String[] args) 
	{
		int[] arr= {10,20,20,40,40};
		duplicates(arr);
	}
}
