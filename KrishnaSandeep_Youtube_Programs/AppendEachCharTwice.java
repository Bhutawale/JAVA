package com.programs;

public class AppendEachCharTwice
{
	static String appendTwice(String str)
	{
		String append="";
		String appendStr="";
		char[] arr = str.toCharArray();
		for(char c:arr)
		{
			StringBuilder sb=new StringBuilder();
			append = sb.append(c).append(c).toString();
			appendStr=appendStr+append;
		}
		return appendStr;
	}
	public static void main(String[] args) 
	{
		String str="hello"; //hheelllloo
		String appendTwice = appendTwice(str);
		System.out.println(appendTwice);
	}
}
