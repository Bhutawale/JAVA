package com.method;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorting 
{
	public void sort(String str)
	{
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println("Sorted Array: ");
		for(char c: charArray)
		{
			System.out.print(c);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		StringSorting st=new StringSorting(); 
		st.sort(s);
	}
}
