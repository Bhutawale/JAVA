package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndDoubeIt 
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> collect = list.stream().filter(n->n%2==0)
		.map(n->n*2).collect(Collectors.toList());
		
		System.out.println(collect);
		
		List<Integer> collect2 = list.stream()
				.map(n->n*2)
				.collect(Collectors.toList());
		
		System.out.println(collect2);
		
		list.stream().sorted().forEach(System.out::println);
		System.out.println("---------------");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("---------------");
		
		Integer min = list.stream().min((x,y)->x-y).get();
		System.out.println(min);
		System.out.println("---------------");
		Integer max = list.stream().max((x,y)->x-y).get();
		System.out.println(max);
		System.out.println("---------------");
		long count = list.stream().count();
		System.out.println(count);
	}
}
