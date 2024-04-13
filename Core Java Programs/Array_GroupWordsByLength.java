package com.method;

import java.util.Scanner;

public class Array_GroupWordsByLength 
{
	public void length(String str,int length)
	{
		String[] split = str.split(" ");
		for(String s:split)
		{
			if(s.length()==length)
			{
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args)
	{
		String str=" helo my name is satish ";
		System.out.println("Given String: "+str);
		System.out.println("Enter the length of words: ");
		Scanner scan=new Scanner(System.in);
		int length=scan.nextInt();
		Array_GroupWordsByLength l=new Array_GroupWordsByLength();
		l.length(str,length);
	}
}
