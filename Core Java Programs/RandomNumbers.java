package com.method;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumbers 
{
	public static void main(String[] args) {
		Random r=new Random();
		r.ints(0, 100).limit(100).sorted().forEach(System.out::println);
	}
}
