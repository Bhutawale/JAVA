package com.method;

import java.util.Scanner;

public class VowelsCount 
{
	public static int count(String s)
	{
		int count=0;
		char[] arr=new char[] {'a','e','i','o','u'};
		char[] charArray = s.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(charArray[i]==arr[j])
				{
					count=count+1;
				}
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		String str;
		System.out.println("Enter the string: ");
		Scanner scan=new Scanner(System.in);
		str=scan.next();
		int count = count(str);
		System.out.println("Number of Vowels in the given String are: "+count);
	}
}
