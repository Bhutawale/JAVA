package com.method;

import java.util.Scanner;

public class FrequencyOfLetters
{
	public void frequency(String str)
	{
		int[] count=new int[256];
		char[] array = str.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			count[array[i]]=count[array[i]]+1;
		}
		for(int j=0;j<count.length;j++)
		{
			if(count[j]>0)
			{
				System.out.println((char)j+":"+count[j]);
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		FrequencyOfLetters f=new FrequencyOfLetters();
		f.frequency(s);
	}
}
