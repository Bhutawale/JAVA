package com.KrishnaSandeep_Youtube_Programs;

import java.util.ArrayList;
import java.util.List;

public class SubStrings 
{
	public static List<String> subString(String str)
	{
		List<String> list=new ArrayList<>();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				list.add(str.substring(i, j));
			}
		}
		return list;
	}
	public static void main(String[] args) 
	{
		String str="abcd";
		List<String> subString = subString(str);
		subString.stream().forEach(System.out::println);
		
	}
}
