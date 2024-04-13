package com.method;

import java.util.Scanner;

public class CountVowelsInString 
{
	public int countvowels(String str)
	{
		int count=0;
		char[] vowels=new char[] {'a','e','i','o','u'};
		String lowerCase = str.toLowerCase();
		char[] charArray = lowerCase.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			for(int j=0;j<vowels.length;j++)
			{
				if(charArray[i]==vowels[j])
				{
					count=count+1;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		String s=new String(scan.next());
		CountVowelsInString c=new CountVowelsInString();
		int countvowels = c.countvowels(s);
		System.out.println("Number of vowels in String: "+countvowels);
	}
}
