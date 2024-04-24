package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementInArray 
{
	public static void majorityElement(int[] arr)
	{
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		int major=arr.length/2;
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
			if(entry.getValue()>major)
				System.out.println("Majority Element: "+entry.getKey());
				
	}
	public static void main(String[] args) 
	{
		int[] arr= {10,20,10,10,40,40,40,40,40};
		majorityElement(arr);
	}
}
