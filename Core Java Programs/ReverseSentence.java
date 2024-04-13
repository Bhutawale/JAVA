package com.method;

import java.util.Scanner;

public class ReverseSentence 
{
	String str;
	
	public static String reverse(String s)
	{
		String rev="";
		String[] split = s.split(" ");
		for(int i=split.length-1;i>=0;i--)
		{
			rev=rev+split[i]+" ";
		}
		return rev;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the Sentence: ");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String reverse = reverse(s);
		System.out.println("The reverse sentence is: "+reverse);
		scan.close();
	}
}
