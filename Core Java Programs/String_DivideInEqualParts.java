package com.method;

import java.util.Scanner;

public class String_DivideInEqualParts
{
	public void divide(String str,int parts)
	{
		int length=str.length();
		int division=length/parts;
		if(length%2==0)
		{
			System.out.println("Strings after division: ");
			char[] array = str.toCharArray();
			for(int j=0;j<division;j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
			for(int i=division;i<array.length;i++)
			{
				System.out.print(str.charAt(i));
		}
		}
		else
		{
			System.out.println("Division of String is not Possible");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		
		int parts=2;
		String_DivideInEqualParts d=new String_DivideInEqualParts();
		d.divide(str,parts);
		scan.close();
	}
}
