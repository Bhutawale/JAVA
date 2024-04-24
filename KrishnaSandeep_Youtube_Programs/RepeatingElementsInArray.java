package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashMap;
import java.util.Map;

public class RepeatingElementsInArray 
{
	public static void repeatingElements(int[] arr)
	{
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println("No."+":"+"Time Repeating");
		System.out.println("------------------------");
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {4,2,3,5,1,2,4,5};
		repeatingElements(arr);
	}
}
