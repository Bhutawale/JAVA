package com.method;

import java.util.Scanner;

public class ReverseSentenceCharacters 
{
	String str;
	
	public static String reverse(String s)
	{
		String rev="";
		String[] split = s.split(" ");
		for(int i=split.length-1;i>=0;i--)
		{
			char[] array = split[i].toCharArray();
			for(int j=array.length-1;j>=0;j--)
			{
				rev=rev+array[j]+" ";
			}
		}
		return rev;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the sentence: ");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String reverse = reverse(s);
		System.out.println("Reverse characters are: "+reverse);
	}
}
