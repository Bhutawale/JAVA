package com.DesignPattern.DeepCopy;

public class College 
{
	String name;

	public College(String name) {
		super();
		this.name = name;
	}

	public College(College college)
	{
		this.name=college.name;
	}
	
	@Override
	public String toString() {
		return "College [name=" + name + "]";
	}
	
	
}
