package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FindWordsAndItsLength 
{
	public static Map<String,Integer> wordLength(String str)
	{
		String[] split = str.split(" ");
		
		Map<String,Integer> map=new HashMap<>();
		
		for(int i=0;i<split.length;i++)
		{	
			map.put(split[i], split[i].length());
		}
		return map;
	}
	public static void main(String[] args) 
	{
		String str="hey hi hello satish welcome to java";
		Map<String, Integer> wordLength = wordLength(str);
		Iterator<Entry<String, Integer>> iterator = wordLength.entrySet().iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
