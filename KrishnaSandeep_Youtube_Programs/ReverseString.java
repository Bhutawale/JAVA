package com.KrishnaSandeep_Youtube_Programs;

public class ReverseString 
{
	public static String reverse(String str)
	{
		String[] split = str.split(" ");
		String rev="";
		for(int i=0;i<split.length;i++)
		{
			StringBuffer sb=new StringBuffer(split[i]);
			rev = rev+sb.reverse().toString();
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		String str="Hello World";
		String reverse = reverse(str);
		System.out.println(reverse);
	}
}
