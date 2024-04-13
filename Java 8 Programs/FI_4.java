package com.Java_8_Programs;

import java.util.Arrays;

@FunctionalInterface
interface inter4
{
	public void anagram(String s1,String s2);
}
public class FI_4 
{
	public static void main(String[] args) 
	{
		String s1="race";
		String s2="care";
		
		inter4 i=(str1,str2)->
				{
					char[] arr1 = str1.toCharArray();
					char[] arr2 = str2.toCharArray();
					
					if(arr1.length==arr2.length)
					{
						Arrays.sort(arr1);
						Arrays.sort(arr2);
						
						if(Arrays.equals(arr1, arr2))
						{
							System.out.println("Anagram Strings");
						}
						else
						{
							System.out.println("Not Anagram Strings");
						}
					}
					else
					{
						System.out.println("Strings are Not Anagram");
					}
				};
				i.anagram(s1, s2);
	}
}
