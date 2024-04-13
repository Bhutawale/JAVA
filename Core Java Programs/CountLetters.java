package com.method;

public class CountLetters 
{
	public static void main(String[] args) 
	{
		String str="satish";
		
		int[] count=new int[256];
		
		char[] array = str.toCharArray();
		
		for(int i=0;i<array.length;i++)
		{
			count[array[i]]++;
		}
		for(int j=0;j<count.length;j++)
		{
			if(count[j]>0)
			System.out.println((char)j+" : "+count[j]);
		}
	}
}
