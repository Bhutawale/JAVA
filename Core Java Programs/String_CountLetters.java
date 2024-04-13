package com.method;

public class String_CountLetters 
{
	public void count(String str)
	{
		int[] count=new int[256];
		char[] array = str.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			count[array[i]]++;
		}
		for(int j=0;j<count.length;j++)
		{
			if(count[j]>0)
			{
				System.out.println((char)j+" : "+count[j]);
			}
		}
	}
	public static void main(String[] args) {
		String str="rajveer";
		String_CountLetters l=new String_CountLetters();
		l.count(str);
	}
}
