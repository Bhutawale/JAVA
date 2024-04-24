package com.KrishnaSandeep_Youtube_Programs;

public class WordsVowelsFrequencyOfCharInString 
{
	public static void countWords(String str)
	{
		String[] split = str.split(" ");
		int countWords = split.length;
		System.out.println("Words in given String: "+countWords);
	}
	public static void countVowels(String str)
	{
		int countVowels=0;
		String[] split = str.split(" ");
		for(String s:split) {
			char[] array = s.toCharArray();
			for(char c:array) {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					countVowels++;
				}
			}
		}
		System.out.println("Vowels in given String: "+countVowels);
	}
	public static void frequency(String str)
	{
		int[] count=new int[256];
		String[] split = str.split(" ");
		for(int i=0;i<split.length;i++)
		{
			char[] array = split[i].toCharArray();
			for(int j=0;j<array.length;j++)
			{
				count[array[j]]=count[array[j]]+1;
			}
		}
		System.out.println("Frequency of each character in given String");
		for(int i=0;i<count.length;i++)
			if(count[i]!=0)
				System.out.println((char)i+" : "+count[i]);
			
	}
	public static void main(String[] args) 
	{
		String str="learn java coding from javatpoint";
		countWords(str);
		countVowels(str);
		frequency(str);
	}
}
