package com.method;

import java.util.Scanner;

public class FrequencyOfCharacters 
{
	public void frequency(String str)
	{
		int[] count=new int[256];
		
		char[] vowels=new char[] {'a','e','i','o','u'};
		
		int v_count=0;
		
		String[] split = str.split(" ");
		
		for(String s:split)
		{
			char[] array = s.toCharArray();
			for(int i=0;i<array.length;i++)
			{
				count[array[i]]=count[array[i]]+1;
				
				for(int k=0;k<vowels.length;k++)
				{
					if(array[i]==vowels[k])
					{
						v_count++;
						System.out.println(array[i]);
					}
				}
			}	
		}
		System.out.println("Vowels present: "+v_count);
		System.out.println("Number of Words Present: "+split.length);
		
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
		String str=new String(scan.nextLine());
		FrequencyOfCharacters f=new FrequencyOfCharacters();
		f.frequency(str);
	}
}
