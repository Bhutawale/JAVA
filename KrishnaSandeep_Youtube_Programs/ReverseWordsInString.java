package com.KrishnaSandeep_Youtube_Programs;

public class ReverseWordsInString 
{
	public static String reverse(String str)
	{
		String reverse="";
		String[] split = str.split(" ");
		
		for(int i=split.length-1;i>=0;i--)
		{
			reverse=reverse+split[i]+" ";
		}
		
		return reverse;
	}
	public static void main(String[] args) 
	{
		String str="Welcome to java World";
		
		String reverse = reverse(str);
		
		System.out.println(reverse);
	}
}
