package com.DesignPattern.SingletonPattern;

public class SingletonPattern 
{
	private static SingletonPattern instance;
	
	private SingletonPattern()
	{}
	
	public static SingletonPattern getInstance()
	{
		if(instance==null)
		{
			instance=new SingletonPattern();
		}
		return instance;
	}
	
	public static void main(String[] args) 
	{
		SingletonPattern obj1 = SingletonPattern.getInstance();
		SingletonPattern obj2 = SingletonPattern.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
