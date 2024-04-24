package com.KrishnaSandeep_Youtube_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompress 
{
	public static String compressString(String str)
	{
		Map<Character, Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			if(map.get(str.charAt(i))!=null)
			{
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
			else
			{
				map.put(str.charAt(i), 1);
			}
		}
		StringBuilder sb=new StringBuilder();
		for(Map.Entry<Character,Integer> entry: map.entrySet())
		{
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		String compressedString = sb.toString();
		return compressedString;
	}
	
	public static void main(String[] args) 
	{
		String str="aaaabbbcc"; //a4b3c2
		String compressString = compressString(str);
		System.out.println(compressString);
	}
}





