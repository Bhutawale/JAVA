package com.method;

public class PalindromStringsInSentence 
{
	public static void palindrom(String str)
	{
		String[] split = str.split(" ");
		System.out.println("Palindrom Strings in the given String are: ");
		for(int i=0;i<split.length;i++)
		{
			StringBuffer sf=new StringBuffer(split[i]);
			String reverse = sf.reverse().toString();
			if(reverse.contentEquals(split[i]))
			{
				System.out.println(split[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		String str="Hi nitin do you know malayalam i know it";
		palindrom(str);
	}
}
