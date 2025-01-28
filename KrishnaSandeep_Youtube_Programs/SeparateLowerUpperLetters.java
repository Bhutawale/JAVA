package com.programs;

public class SeparateLowerUpperLetters
{
	static void separateLowerUpper(String str)
	{
		String lowerString="";
		String upperString="";
		char[] arr = str.toCharArray();
		for(char c:arr)
		{
			if(Character.isUpperCase(c))
			{
				upperString=upperString+c;
			}
			else if(Character.isLowerCase(c))
			{
				lowerString=lowerString+c;
			}
		}
		System.out.println(upperString);
		System.out.println(lowerString);
	}
	public static void main(String[] args) 
	{
		String str="aBAbCcDedEFfgG";
		separateLowerUpper(str);
	}
}
