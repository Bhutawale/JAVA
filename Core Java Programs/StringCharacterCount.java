package com.method;

import java.util.Scanner;

public class StringCharacterCount 
{
	public void count(String str)
	{
		String[] split = str.split(" ");
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]+":"+split[i].length());
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		String s=new String(scan.nextLine());
		StringCharacterCount c=new StringCharacterCount();
		c.count(s);
	}
}
