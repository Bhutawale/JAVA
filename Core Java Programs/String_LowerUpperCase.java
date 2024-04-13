package com.method;

public class String_LowerUpperCase
{
	public void lowerupper(String str)
	{
		int mid = (str.length())/2;
		String uppercase="";
		String lowercase="";
		for(int i=0;i<str.length();i++)
		{
			if(i<=mid)
			{
				uppercase=uppercase+Character.toUpperCase(str.charAt(i));
			}
			else
			{
				lowercase=lowercase+Character.toLowerCase(str.charAt(i));
			}
		}
		String newStr=uppercase+lowercase;
		System.out.println(newStr);
	}
	public static void main(String[] args) 
	{
		String str="this is java i love coding";
		System.out.println("Original String: "+str);
		String_LowerUpperCase l=new String_LowerUpperCase();
		l.lowerupper(str);
	}
}
