package com.method;

import java.util.Scanner;

public class CountSpecialCharacters 
{
	public int count(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isWhitespace(str.charAt(i)) ||
					Character.isDigit(str.charAt(i)) ||
					!Character.isLetter(str.charAt(i)))
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		CountSpecialCharacters c=new CountSpecialCharacters();
		int count = c.count(str);
		if(count>0)
		{
			System.out.println("Special Characters in the given String are: "+count);
		}
		else {
			System.out.println("No Special Characters found");
		}
	}
}
