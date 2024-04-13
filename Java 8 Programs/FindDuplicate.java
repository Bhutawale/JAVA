package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate 
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,20,10,40,50);
		Set<Integer> set=new HashSet<Integer>();
		list.stream().filter(d->!set.add(d)).forEach(System.out::println);
		
		//sorting in reverse order.
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
}
