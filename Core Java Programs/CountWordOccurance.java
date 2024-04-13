package com.method;

import java.util.Scanner;

public class CountWordOccurance 
{
	public static void main(String[] args) 
	{
		String str="Welcome to java language java is computer programming language";
		
		int count=0;
		
		System.out.println("Enter the word to count: ");
		Scanner scan=new Scanner(System.in);
		String word=scan.next();
		
		String[] split = str.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			if(word.equals(split[i]))
			{
				count++;
			}
		}
		System.out.println("Number of occurance of "+word+" is "+count);
	}
}
