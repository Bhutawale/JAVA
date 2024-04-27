package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString 
{
	public static Map<String,Integer> duplicate(String str)
	{
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		String[] split = str.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			map.put(split[i], map.getOrDefault(split[i], 0)+1);
		}
		
		return map;
	}
	public static void main(String[] args) 
	{
		String str="apple mango banana grapes apple banana mango apple";
		Map<String, Integer> duplicate = duplicate(str);
		System.out.println("Duplicate Words in String with count: ");
		for(Map.Entry<String, Integer> entry:duplicate.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
	}
}
