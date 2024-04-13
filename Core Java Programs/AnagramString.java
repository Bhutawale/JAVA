package com.method;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString 
{
	public void anagram(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			char[] s1Array = s1.toCharArray();
			char[] s2Array = s2.toCharArray();
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			
			if(Arrays.equals(s1Array, s2Array))
			{
				System.out.println("Anagram Strings");
			}
			else
			{
				System.out.println("Strings NOT Anagram!!");
			}
		}
		else
		{
			System.out.println("Strings are NOT Anagram!!");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the String 1: ");
		Scanner sc1=new Scanner(System.in);
		String s1=new String(sc1.next());
		System.out.println("Enter the String 2 :");
		Scanner sc2=new Scanner(System.in);
		String s2=sc2.next();
		AnagramString a=new AnagramString();
		a.anagram(s1,s2);
	}
}
