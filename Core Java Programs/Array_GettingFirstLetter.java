package com.method;

import java.util.Scanner;

public class Array_GettingFirstLetter 
{
	public void getFirstLetter(String str)
	{
		if(str.isEmpty() || str==null)
		{
			System.out.println("Invalid Input.Please enter string");
			return;
		}
		String[] split = str.split(" ");
		for(String s:split)
		{
			System.out.print(s.charAt(0)+" ");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		Array_GettingFirstLetter get=new Array_GettingFirstLetter();
		get.getFirstLetter(str);
		scan.close();
	}
}
