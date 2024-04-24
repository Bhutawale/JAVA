package com.KrishnaSandeep_Youtube_Programs;

import java.util.ArrayList;
import java.util.List;

public class EvenLengthWordsInStrings 
{
	public static List<String> evenLengthWords(String str)
	{
		List<String> list=new ArrayList<String>();
		
		String[] split = str.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			if(split[i].length()%2==0)
			{
				list.add(split[i]);
			}
		}
		
		return list;
	}
	public static void main(String[] args) 
	{
		String str="hello satish learn java";
		List<String> evenLengthWords = evenLengthWords(str);
		evenLengthWords.stream().forEach(System.out::println);
	}
}
