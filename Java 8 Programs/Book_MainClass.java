package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Book_MainClass	
{
	public static void main(String[] args) 
	{
		List<Book> list = Arrays.asList(
				new Book("C Programming", "ABC", 1991, 250.0),
				new Book("CPP Programming", "XYZ", 2000, 350.0),
				new Book("HTML Programming", "PQR", 2005, 450.0),
				new Book("JAVA Programming", "OPQ", 2010, 550.0),
				new Book("PYTHON Programming", "JKL", 1988,600.0));
		
		List<Book> collect = list.stream().filter(b->b.getYear()>2000).collect(Collectors.toList());
		
		System.out.println("Books published after 2000:");
		Iterator<Book> iterator = collect.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("---------------------");
		
		System.out.println("Total Price of all Books: ");
		
		double sum = list.stream().mapToDouble(b->b.getPrice()).sum();
		System.out.println(sum);
		
		System.out.println("---------------------");
		
		System.out.println("Books with price less then 250");
		List<Book> collect2 = list.stream().filter(b->b.getPrice()<450).collect(Collectors.toList());
		
		Iterator<Book> itr = collect2.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("---------------------");
		
		Optional<Book> max = list.stream().max((b1,b2)->Double.compare(b1.getPrice(), b2.getPrice()));
		
		System.out.println(max);
		
		
	}
}
