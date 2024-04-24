package com.KrishnaSandeep_Youtube_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetativeCharUsingHashMap
{
	public static char nonRepetativeChar(String str)
	{
		char rep=0;
		
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		char[] array = str.toCharArray();
		
		for(int i=0;i<array.length;i++)
		{
			map.put(array[i], map.getOrDefault(array[i], 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				rep=entry.getKey();
				break;
			}
		}
		
		return rep;
	}
	public static void main(String[] args) 
	{
		String str="aabbccddeffg";
		char c = nonRepetativeChar(str);
		System.out.println("First Nonrepetative Character: "+c);
	}
}
