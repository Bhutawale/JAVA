package com.DesignPattern.ShallowCopy;

class Student implements Cloneable
{
	
	 int id;
	 String name;
	 College college;
	public Student(int id, String name, College college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
public class ShallowCopy_Student 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		College college=new College("YMT");
		Student s1=new Student(101, "satish", college);
		Student s2 =(Student) s1.clone();
		
		s2.college.collegeName="IBSAR";
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
