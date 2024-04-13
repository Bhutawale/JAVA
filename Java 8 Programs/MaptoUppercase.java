package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaptoUppercase 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("car","jeep","truck","bicycle","train");
		
		list.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		
		List<Integer> length = list.stream().map(s->s.length()).collect(Collectors.toList());
		
		System.out.println(length);
		
	}
}
