package com.KrishnaSandeep_Youtube_Programs;

import java.util.Arrays;

public class AnagramStrings 
{
	public static boolean areAnagram(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
		
			Arrays.sort(arr1);
			Arrays.sort(arr2);
		
			if(Arrays.equals(arr1, arr2))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	public static void main(String[] args) 
	{
		String s1="java";
		String s2="avaj";
	boolean areAnagram = 	areAnagram(s1,s2);
	if(areAnagram)
		System.out.println("Both Strings are Anagram");
	else
		System.out.println("Both Strings are not Anagram");
	}
}
