package com.method;

import java.util.Scanner;

public class Recursion_ReverseString
{
	public String reverse(String str)
	{
		if(str.length()<=1 || str==null)
		{
			return str;
		}
		else
		{
			return reverse(str.substring(1))+str.charAt(0);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		String s=new String(scan.next());
		Recursion_ReverseString r=new Recursion_ReverseString();
		String reverse = r.reverse(s);
		System.out.println("Reverse String is: "+reverse);
	}
}
