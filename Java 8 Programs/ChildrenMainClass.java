package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ChildrenMainClass 
{
	public static void main(String[] args) 
	{
		List<Children> list = Arrays.asList(
				new Children(2, "satish", 'm', 5),
				new Children(1, "sagar", 'm', 7),
				new Children(3, "sanskruti", 'f', 4),
				new Children(5, "shloka", 'f', 3),
				new Children(4, "vicky", 'm', 6));
		
		System.out.println("Group Children based on gender: ");
		Map<Character, List<Children>> collect = 
				list
				.stream()
				.collect(Collectors.groupingBy
						(Children::getGender));
		
		Iterator<Entry<Character, List<Children>>> iterator = collect.entrySet().iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		
	}
}
