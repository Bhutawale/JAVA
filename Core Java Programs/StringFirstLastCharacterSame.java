package com.method;

public class StringFirstLastCharacterSame 
{
	public static void main(String[] args) 
	{
		String str="abccabbc";
		/*The output should be 
		abcca , 
		bccab,
		bccabb,
		cc,
		cabbc
		The first and last char should be same.*/
		for(int i=0;i<=str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				String substr=str.substring(i, j);
				if(substr.length()>1 && substr.charAt(0)==substr.charAt(substr.length()-1))
				{
					System.out.println(substr);
				}
			}
		}
	}
}
