package com.method;

import java.util.Scanner;

public class EvenWordsInString 
{
	public void evenwords(String str)
	{
		int count=0;
		String[] split = str.split(" ");
		for(int i=0;i<split.length;i++)
		{
			if(split[i].length() % 2 == 0)
			{
				count=count+1;
				System.out.println(split[i]);
			}
		}
		System.out.println("Even Words in the given String: "+ count);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		String s=new String(scan.nextLine());
		EvenWordsInString e=new EvenWordsInString();
		e.evenwords(s);
	}
}
