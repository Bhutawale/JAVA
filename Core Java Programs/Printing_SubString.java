package com.method;

import java.util.Scanner;

public class Printing_SubString 
{
	public void substring(String str)
	{
		for(int i=0;i<=str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		String str=new String(scan.next());
		Printing_SubString p=new Printing_SubString();
		p.substring(str);
	}
}
