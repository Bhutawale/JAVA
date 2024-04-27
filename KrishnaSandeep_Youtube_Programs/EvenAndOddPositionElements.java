package com.KrishnaSandeep_Youtube_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvenAndOddPositionElements 
{
	public static Map<String, List<Integer>> EvenOddPosition(int[] arr)
	{
		Map<String, List<Integer>> map=new HashMap<String, List<Integer>>();

		List<Integer> even=new ArrayList<>();
		List<Integer> odd=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)

			if(i%2==0)
			{
				even.add(arr[i]);
			}
			else
			{
				odd.add(arr[i]);
			}
		
		map.put("Even", even);
		map.put("Odd", odd);
		return map;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		Map<String, List<Integer>> map = EvenOddPosition(arr);
		for(Map.Entry<String, List<Integer>> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
