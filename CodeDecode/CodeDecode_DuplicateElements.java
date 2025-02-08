package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee_02
{
	int age;
	String name;
	int salary;
	String dept;
	String gender;
	int joining;
	public Employee_02(int age, String name, int salary, String dept, String gender, int joining) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.gender = gender;
		this.joining = joining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getJoining() {
		return joining;
	}
	public void setJoining(int joining) {
		this.joining = joining;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", gender="
				+ gender + ", joining=" + joining + "]";
	}
	
	
}

public class CodeDecode_DuplicateElements 
{
	public static void main(String[] args) 
	{
		List<Employee_02> list = Arrays.asList(
				new Employee_02(23, "Abc", 25000, "hr", "male", 2015),
				new Employee_02(27, "xyz", 35000, "tech", "female", 2014),
				new Employee_02(43, "pqr", 55000, "hr", "female", 2012),
				new Employee_02(53, "sdf", 45000, "ops", "male", 2016),
				new Employee_02(53, "sdf", 45000, "ops", "male", 2016));
		
		//1st approach
		
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(emp->emp.getName(),Collectors.counting()));
		
		Set<String> duplicateEmp = collect.entrySet().stream()
														.filter(entry->entry.getValue()>1)
														.map(entry->entry.getKey())
														.collect(Collectors.toSet());
		System.out.println(duplicateEmp);
		
		System.out.println("-------------------");
	
		//2nd approach
		
		List<String> collect2 = list.stream().map(e->e.getName()).collect(Collectors.toList());
		System.out.println(collect2);
		Map<String, Long> collect3 = collect2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect3);
		Set<Entry<String,Long>> collect4 = collect3.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toSet());
		System.out.println(collect4);
		Set<String> collect5 = collect4.stream().map(entry->entry.getKey()).collect(Collectors.toSet());
		System.out.println(collect5);
		
		System.out.println("--------------------");
		
		
		//3rd approach
		
		List<String> collect6 = list.stream().map(e->e.getName()).collect(Collectors.toList());
		Set<String> collect7 = collect6.stream().filter(name->Collections.frequency(collect6, name)>1).collect(Collectors.toSet());
		System.out.println(collect7);
		
	}
}
