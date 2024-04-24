package com.KrishnaSandeep_Youtube_Programs;

public class ReverseString_1 
{
	public static String reverse(String str)
	{
		String[] split = str.split(" ");
		String rev="";
		for(int i=0;i<split.length;i++)
		{
			char[] array = split[i].toCharArray();
			for(int j=array.length-1;j>=0;j--)
			{
				rev=rev+array[j];
			}
			if(i<split.length-1)
				rev=rev+" ";
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
