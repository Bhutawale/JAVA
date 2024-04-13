package com.method;

public class String_Rotation 
{
	public static void main(String[] args)
	{
		String s1="satish";
		String s2="ishsat";
		
		String concat = s1.concat(s1);
		System.out.println(concat);
		
		boolean contains = concat.contains(s2);
		
		if(contains)
		{
			System.out.println("Rotation String");
		}
		else
		{
			System.out.println("Not Rotation String");
		}
	}
}
