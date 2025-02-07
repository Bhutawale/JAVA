package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Employee_gr
{
	int age;
	String name;
	int salary;
	String dept;
	String gender;
	int joining;
	public Employee_gr(int age, String name, int salary, String dept, String gender, int joining) {
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
public class CodeDecode_GroupingBy 
{
	public static void main(String[] args) 
	{
		List<Employee_gr> list = Arrays.asList(
				new Employee_gr(23, "Abc", 25000, "hr", "male", 2015),
				new Employee_gr(27, "xyz", 35000, "tech", "female", 2014),
				new Employee_gr(43, "pqr", 55000, "hr", "female", 2012),
				new Employee_gr(53, "sdf", 45000, "ops", "male", 2016));
		
		//first variation of groupingBy.
		//By default groupingBy gives LIST.
		Map<Integer, List<Employee_gr>> groupByAge = list.stream().collect(Collectors.groupingBy(Employee_gr::getAge));
		for(Map.Entry<Integer, List<Employee_gr>> entry: groupByAge.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("----------------------");
		
		
		//second variation of groupingBy.
		//if we want unique results then we must store the result to SET.
		Map<Integer, Set<Employee_gr>> unique_groupByAge = list.stream().collect(Collectors.groupingBy(Employee_gr::getAge,Collectors.toSet()));
		for(Map.Entry<Integer, Set<Employee_gr>> entry: unique_groupByAge.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("-----------------------");

		//Third variation of groupingBy.
		//sort using treeMap.
		
		TreeMap<Integer, Set<Employee_gr>> unique_groupByAge_Sort = list.stream().collect(Collectors.groupingBy(Employee_gr::getAge,TreeMap::new,Collectors.toSet()));
		for(Map.Entry<Integer, Set<Employee_gr>> entry: unique_groupByAge_Sort.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
