package com.method;

public class String_CharacterFrequency 
{
	public static void main(String[] args)
	{
		String str="picture perfect";
		int[] count=new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		for(int j=0;j<count.length;j++)
		{
			if(count[j]>=1)
				System.out.println((char)j+" : "+count[j]);
		}
	}
}
