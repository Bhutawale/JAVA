package com.KrishnaSandeep_Youtube_Programs;

public class ReverseStringRecursion 
{
	public static String reverse(String str)
	{
		if(str==null || str.length()<=1)
			return str;
		else
			return reverse(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) 
	{
		String str="satish";
		String reverse = reverse(str);
		System.out.println(reverse);
	}
}
