package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PatientMain
{
	public static void main(String[] args) 
	{
		List<Patient> list = Arrays.asList(
				new Patient(1, "satish", 10000),
				new Patient(3, "sagar", 15000),
				new Patient(5, "vicky", 5000),
				new Patient(2, "nitin", 1000),
				new Patient(4, "amol", 30000));
		
		System.out.println("Sorting by name: ");
		list.sort(Comparator.comparing(Patient::getName));
		
		Iterator<Patient> iterator = list.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("--------------");
		
		System.out.println("Sorting Bills: ");
		
		list.sort(Comparator.comparing(Patient::getBill));
		
		Iterator<Patient> it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("---------------");
		
		System.out.println("Sorting by Id and then bill amount: ");
		list.sort(Comparator.comparing(Patient::getId).thenComparing(Patient::getBill));
		//if in case their is tie in first comparing object.
		Iterator<Patient> itr = list.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
