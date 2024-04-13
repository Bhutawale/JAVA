package com.method;

public class ReverseEachWordInString 
{
	public static void main(String[] args)
	{
		String str="Welcome To Java";
		
		String[] split = str.split(" ");
		
		String rev="";
		
		for(int i=0;i<split.length;i++)
		{
			char[] array = split[i].toCharArray();
			for(int j=array.length-1;j>=0;j--)
			{
				rev=rev+array[j];
			}
			rev+=" ";
		}
		System.out.println(rev);
	}
}
