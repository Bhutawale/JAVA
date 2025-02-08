package com.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

class Employee_01
{
	int age;
	String name;
	int salary;
	String dept;
	String gender;
	int joining;
	public Employee_01(int age, String name, int salary, String dept, String gender, int joining) {
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
public class CodeDecode_MinMaxAvg 
{
	public static void main(String[] args)
	{
		List<Employee_01> list = Arrays.asList(
				new Employee_01(23, "Abc", 25000, "hr", "male", 2015),
				new Employee_01(27, "xyz", 35000, "tech", "female", 2014),
				new Employee_01(43, "pqr", 55000, "hr", "female", 2012),
				new Employee_01(53, "sdf", 45000, "ops", "male", 2016));
		
		IntSummaryStatistics statistics = list.stream().mapToInt(Employee_01::getAge).summaryStatistics();
		int maxAgeOfEmployee = statistics.getMax();
		System.out.println("Oldest employee in the company: "+maxAgeOfEmployee);
		
		double averageAgeOfEmployees = list.stream().mapToInt(Employee_01::getAge).summaryStatistics().getAverage();
		System.out.println("Average age of all employees: "+averageAgeOfEmployees);
		
		int minAgeOfEmployee = list.stream().mapToInt(Employee_01::getAge).summaryStatistics().getMin();
		System.out.println("Youngest employee in the company: "+minAgeOfEmployee);
		
		long sumOfAgesOfAllEmployees = list.stream().mapToInt(Employee_01::getAge).summaryStatistics().getSum();
		System.out.println("Sum of Ages of all employees: "+sumOfAgesOfAllEmployees);
		
		long totalEmployess = list.stream().mapToInt(Employee_01::getAge).summaryStatistics().getCount();
		System.out.println("Total employees in the company: "+totalEmployess);
	}
}
