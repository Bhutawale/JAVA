package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Products_MainClass
{
	public static void main(String[] args) 
	{
		List<Products> list = Arrays.asList(
				new Products(101, "Java", "Books", 150),
				new Products(102, "Html", "Books", 100),
				new Products(103, "CSS", "Books", 120),
				new Products(104, "Samsung", "Mobile", 2500),
				new Products(105, "Nokia", "Mobile", 1000));
		
		list.stream()
		.filter(p->p.getCatagory().equals("Books") 
				&& p.getPrice()>100)
		.forEach(System.out::println);
		
		
		System.out.println("----------------------");
		
		
		Products products = list.stream()
		.filter(p->p.getCatagory().equals("Mobile"))
		.min(Comparator.comparing(Products::getPrice)).get();
		
		System.out.println(products);
		
						
	}
}
