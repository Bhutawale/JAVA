package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,21,30,43,50,60,55);
		
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		
		List<String> fruits = 
				Arrays.asList("apple","banana","cherry","peru","mango","anjir");
		
		List<String> collect = fruits.stream().filter(s->s.length()>5 && s.length()<8).collect(Collectors.toList());
		
		System.out.println(collect);
	
		List<String> list2 = Arrays.asList("aabb","abc","ccc",null,"ddd",null);
		
		List<String> collect2 = list2.stream().filter(s->s!=null).collect(Collectors.toList());
		System.out.println(collect2);
	}
}
