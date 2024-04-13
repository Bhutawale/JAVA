package com.method;

public class PanagramString 
{
	public static void main(String[] args) 
	{
		String str="the quick brown fox jumps over the lazy dog";
		if(str.length()<26)
		{
			System.out.println("Not Panagram String");
		}
		else
		{
			for(char ch='a';ch<='z';ch++)
			{
				if(str.indexOf(ch)<0)
				{
					System.out.println("Not Panagram String");
				}
			}
			System.out.println("Panagram String");
		}
	}
}
