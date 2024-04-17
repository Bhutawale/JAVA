package com.Java_8_Programs;

public class ReplaceOccurranceOfChar
{
	public static String removeChar(String str,char remove)
	{
		String newstr="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=remove)
			{
				newstr=newstr+str.charAt(i);
			}
		}
		return newstr;
	}
	public static void main(String[] args) 
	{
		String str="satish";
		char remove='s';
		
		String newStr = removeChar(str,remove);
		System.out.println(newStr);
	}	
}
