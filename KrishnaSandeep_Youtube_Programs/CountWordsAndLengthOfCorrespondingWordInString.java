package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashMap;
import java.util.Map;

public class CountWordsAndLengthOfCorrespondingWordInString 
{
	public static Map<String, Integer> count(String str)
	{
		Map<String , Integer> map=new HashMap<String, Integer>();
		
		String[] split = str.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			map.put(split[i], split[i].length());
		}
		
		return map;
	}
	public static void main(String[] args) 
	{
		String str="Hello Satish Learn Java Programming";
		Map<String, Integer> map = count(str);
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
