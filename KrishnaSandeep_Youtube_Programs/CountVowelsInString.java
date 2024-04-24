package com.KrishnaSandeep_Youtube_Programs;

public class CountVowelsInString 
{
	public static int countVowels(String str)
	{
		int vowels=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || 
					str.charAt(i)=='e' || 
					str.charAt(i)=='i' ||
					str.charAt(i)=='o' ||
					str.charAt(i)=='u')
			{
				vowels++;
			}
		}
		
		return vowels;
	}
	public static void main(String[] args) 
	{
		String str="satish";
		int countVowels = countVowels(str);
		System.out.println("Total Vowels: "+countVowels);
	}
}
