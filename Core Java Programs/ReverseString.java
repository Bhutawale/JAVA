package com.method;

import java.util.Scanner;

public class ReverseString
{
	String str;
	
	public static String reverse(String s)
	{
		String rev=" ";
		char[] array = s.toCharArray();
		for(int i=array.length-1;i>=0;i--)
		{
			rev=rev+array[i];
		}
		return rev;
	}
	
	public static void main(String[] args)
	{
		String s;
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		s=scan.next();
		System.out.println("Original String: "+s);
		String reverse = reverse(s);
		System.out.println("Reverse String: "+reverse);
	}
}
