package com.KrishnaSandeep_Youtube_Programs;

import java.util.ArrayList;
import java.util.List;

public class EvenLengthWordsInString
{
	public static List<String> evenWords(String str)
	{
		List<String> list=new ArrayList<>();
		String[] split = str.split(" ");
		for(String s:split)
			if(s.length()%2==0) 
			{
				list.add(s);
			}
		return list;
		
	}
	public static void main(String[] args) 
	{
		String str="Hey hi satish welcome to java world";
		List<String> evenWords = evenWords(str);
		evenWords
		.stream()
		.map(s->s.toUpperCase())
		.forEach(System.out::println);;
	}
}
