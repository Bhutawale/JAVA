package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfOccurranceOfChar 
{
	public static Map<Character,Integer> countOccurrance(String str,Character ch)
	{
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		int count=0;
		
		String[] split = str.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			char[] array = split[i].toCharArray();
			
			for(int j=0;j<array.length;j++)
			{
				if(array[j]==ch)
				{
					count++;
				}
			}
		}
		map.put(ch, count);
		
		return map;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter String: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println("Enter the character to find and its occurrnces: ");
		Scanner scan1=new Scanner(System.in);
		char ch=scan1.next().charAt(0);
		Map<Character, Integer> countOccurrance = countOccurrance(str,ch);
		System.out.println(countOccurrance);
		scan.close();
		scan1.close();
	}
}
