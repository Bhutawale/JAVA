package com.method;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterFrequencyUsingHashmap 
{
	public static void main(String[] args) {
		String str="satish";
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		System.out.println("Frequency: ");
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
