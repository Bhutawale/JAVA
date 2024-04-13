package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumbers
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,2,3,3,4,4,5,6,7,7);
		
		List<Integer> collect = list.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream()
		.filter(e->e.getValue()>1)
		.map(m->m.getKey()).collect(Collectors.toList());
		
		System.out.println("Duplicate numbers: "+collect);
		
		List<Integer> unique = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()==1)
		.map(m->m.getKey()).collect(Collectors.toList());
		
		System.out.println("Unique Elements: "+unique);
	}
}
