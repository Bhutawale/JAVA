package com.DesignPattern.DeepCopy;

class Student
{
	int id;
	String name;
	College college;
	public Student(int id, String name, College college) {
		super();
		this.id = id;
		this.name = name;
		this.college = new College(college);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	
	
}
public class DeepCopyExample 
{
	public static void main(String[] args) 
	{
		College college=new College("YMT");
		
		Student s1=new Student(101, "Satish", college);
		
		Student s2 = new Student(s1.id,s1.name,s1.college);
		
		s2.college.name="IBSAR";
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
