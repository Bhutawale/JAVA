package com.method;

public class CountWordInString 
{
	public static void main(String[] args) 
	{
		String str="Welcome to java";
		
		int count=0;
		
		String[] split = str.split(" ");
		
		for(String s:split)
		{
			count++;
		}
		System.out.println(count);
	}
}
