package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString 
{
	public static void longestSubstring(String str)
	{
		Map<String,Integer> map=new HashMap<>(); 
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				map.put(str.substring(i, j),str.substring(i, j).length());
			}
		}
		int maxLength=0;
		String longestSubstring="";
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>maxLength)
			{
				maxLength=entry.getValue();
				longestSubstring=entry.getKey();
			}
		}
		System.out.println("Longest Substring: "+longestSubstring);
	}
	public static void main(String[] args) 
	{
		String str="abcda";
		longestSubstring(str);
	}
}
