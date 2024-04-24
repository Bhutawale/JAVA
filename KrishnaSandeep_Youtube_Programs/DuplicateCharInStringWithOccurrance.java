package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInStringWithOccurrance 
{
	public static Map<Character, Integer> duplicateChars(String str)
	{
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		return map;
	}
	public static void main(String[] args) 
	{
		String str="dnyandeep";
		Map<Character, Integer> duplicateChars = duplicateChars(str);
		for(Map.Entry<Character, Integer> entry:duplicateChars.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
	}
}
