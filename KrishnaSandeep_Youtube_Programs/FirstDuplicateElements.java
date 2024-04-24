package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateElements 
{
	public static int firstDuplicate(int[] arr)
	{
		int dup=0;
		Set<Integer> set=new HashSet<>(); 
		
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
			{
				dup=arr[i];
				return dup;
			}
			else
			{
				set.add(arr[i]);
			}
		}
		
		return dup;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,2,3,6,7};
		int firstDuplicate = firstDuplicate(arr);
		System.out.println(firstDuplicate);
	}
}
