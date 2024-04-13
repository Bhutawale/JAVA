package com.method;

import java.util.LinkedHashSet;
import java.util.Set;

public class SearchDuplicateCharacter
{
	public static void main(String[] args)
	{
		//Approach 1: 
		
		String str="code decode";
		char[] array = str.toCharArray();
		/*Set<Character> dup=new LinkedHashSet<>();
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					dup.add(array[i]);
				}
			}	
		}
		System.out.println(dup);
		*/
		
		//Approach 2:
		
		int[] count=new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		for(int n=0;n<count.length;n++)
		{
			if(count[n]>1)
			System.out.println((char)n);
		}
			
		
		
	}
}
