package com.Java_8_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Multiplyeacharrayelement 
{
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Integer mul = list.stream().reduce(1,(a,b)->a*b);
		System.out.println("Multiplication of all numbers is: "+mul);
		
	}
}
