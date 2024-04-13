package com.Java_8_Programs;

import java.util.ArrayList;

public class NumberGreaterThan 
{
	public static void main(String[] args)
	{
		java.util.List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		
		list.stream().filter(n->n>50).forEach(System.out::println);
	}
}
