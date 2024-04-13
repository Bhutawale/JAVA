package com.method;

import java.util.Arrays;

public class CharacterFrequency 
{
	public static void main(String[] args) {
		String str="banana";
		int[] count=new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		
		System.out.println("Frequency of Characters: ");
		for(int j=0;j<count.length;j++)
		{
			if(count[j]!=0)
			System.out.println((char)j+" : "+count[j]);
		}
	}
}
