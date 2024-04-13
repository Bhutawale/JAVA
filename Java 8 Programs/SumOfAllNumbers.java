package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumOfAllNumbers
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Integer collect = list.stream().collect(Collectors.summingInt(n->n));
		System.out.println(collect);
		
		Optional<Integer> sum = list.parallelStream().reduce((a,b)->a+b);
		System.out.println("The sum is: "+sum.get());
	}
}
