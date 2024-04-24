package com.KrishnaSandeep_Youtube_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountVowelsAndConsonants 
{
	public static Map<Character,Integer> countVowelsConsonants(String str)
	{
		Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		
		String vowels="aeiou";
		int vowelcount=0;
		int consonantscount=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(vowels.contains(String.valueOf(str.charAt(i))))
			{
				vowelcount++;
			}
			else
			{
				consonantscount++;
			}
		}
			map.put('V', vowelcount);
			map.put('C', consonantscount);
		return map;
	}
	public static void main(String[] args) 
	{		
		String str="satish";
		Map<Character, Integer> map = countVowelsConsonants(str);
		for(Map.Entry<Character, Integer> entry:map.entrySet())
			System.out.println(entry.getKey()+" : "+entry.getValue());
	}
}