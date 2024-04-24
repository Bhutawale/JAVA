package com.KrishnaSandeep_Youtube_Programs;

import java.util.Arrays;

public class SortCharactersInString 
{
	public static String sortString(String str)
	{
		char[] array = str.toCharArray();
		Arrays.sort(array);
		String sorted_string = new String(array);
		return sorted_string;
	}
	public static void main(String[] args) 
	{
		String str="satish";
		String sortString = sortString(str);
		System.out.println(sortString);
	}
}
