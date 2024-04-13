package com.method;

public class Array_LengthOfLongestString
{
	public void longest(String[] str)
	{
		String longStr=str[0];
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()>longStr.length())
			{
				longStr=str[i];
			}
		}
		System.out.println("Longest String in the array is: "+longStr);
	}
	public static void main(String[] args) {
		String[] str=new String[] {"apple","banana","strawberry","chikoo"};
		System.out.println("Original Array: ");
		for(String s:str)
		{
			System.out.println(s);
		}
		Array_LengthOfLongestString l=new Array_LengthOfLongestString();
		l.longest(str);
	}
}
