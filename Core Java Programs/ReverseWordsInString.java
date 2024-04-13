package com.method;

public class ReverseWordsInString 
{
	public static void main(String[] args) {
		String str="Welcome to Java";
		
		String[] split = str.split(" ");
		
		for(int i=split.length-1;i>=0;i--)
		{
			System.out.print(split[i]+" ");
		}
	}
}
