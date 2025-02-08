package com.DesignPattern.BuilderDesignPattern;

class Student
{
	private int id;
	private String name;
	private String college;
	
	private Student(StudentBuilder builder)
	{
		this.id=builder.id;
		this.name=builder.name;
		this.college=builder.college;
	}
	
	
	
@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}



public static class StudentBuilder
{
	private int id;
	private String name;
	private String college;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public Student build()
	{
		return new Student(this);
	}
	
}

}
public class BuilderPattern_01 
{
	public static void main(String[] args) 
	{
		Student.StudentBuilder studentBuilder = new Student.StudentBuilder();
		studentBuilder.setId(101);
		studentBuilder.setName("satish");
		studentBuilder.setCollege("YMT");
		
		Student s1=studentBuilder.build();
		System.out.println(s1);
	}
}
