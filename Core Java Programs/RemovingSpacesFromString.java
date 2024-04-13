package com.method;

public class RemovingSpacesFromString 
{
	public static void main(String[] args) {
		String str="     Hello World   Satish  ";
		String newstr="";
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isWhitespace(str.charAt(i)))
			{
				newstr=newstr+str.charAt(i);
			}
		}
		System.out.println(newstr);
	}
}
