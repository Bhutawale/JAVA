package com.method;

import java.util.Arrays;

public class SortCharactersInString 
{
	public static void main(String[] args)
	{
		String str="satish";
		String newstr="";
		char[] array = str.toCharArray();
		
		Arrays.sort(array);
		
		for(char c:array)
		{
			newstr=newstr+c;
		}
		System.out.println("Sorted String : "+newstr);
	}
}
