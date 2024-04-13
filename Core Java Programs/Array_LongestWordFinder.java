package com.method;

public class Array_LongestWordFinder 
{
	public String longest(String str)
	{
		String[] split = str.split(" ");
		String longest=split[0];
		for(int i=0;i<split.length;i++)
		{
			if(split[i].length()>longest.length())
			{
				longest=split[i];
			}
		}
		return longest;
	}
	public static void main(String[] args) 
	{
		String str="this is a program";
		System.out.println("Original String: "+str);
		Array_LongestWordFinder l=new Array_LongestWordFinder();
		String longest = l.longest(str);
		System.out.println("The Longest word in given string is: "+longest);
	}
}
