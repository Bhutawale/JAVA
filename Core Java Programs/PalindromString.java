package com.method;

import java.util.Scanner;

public class PalindromString
{
	String str;
	
	public static void check(String str)
	{
		String ostr=str;
		String rev="";
		char[] array = str.toCharArray();
		for(int i=array.length-1;i>=0;i--)
		{
			rev=rev+array[i];
		}
		if(ostr.equals(rev))
		{
			System.out.println("Palindrom String");
		}
		else
		{
			System.out.println("Not Palindrom String");
		}
	}
	
	public static void main(String[] args) 
	{
		String s;
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		s=scan.next();
		check(s);
		scan.close();
	}
}
