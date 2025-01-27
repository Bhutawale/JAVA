package com.programs;

import java.util.ArrayList;
import java.util.List;

public class EvenIndexedCharacter 
{
	static List<Character> evenIndexedChar(String str)
	{
		List<Character> list=new ArrayList<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				list.add(str.charAt(i));
			}
		}
		
		return list;
	}
	public static void main(String[] args) 
	{
		String str="Automation";
		List<Character> evenIndexedChar = evenIndexedChar(str);
		for(char c:evenIndexedChar)
			System.out.print(c);
	}
}
