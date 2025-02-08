package com.DesignPattern.IteratorDesignPattern;

import java.util.Arrays;
import java.util.List;

class CustomeIterator implements MyIterator
{
	private List<Integer> list;
	private int index=0;
	
	
	public CustomeIterator(List<Integer> list) {
		super();
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		if(index<list.size())
			return true;
		else
			return false;
	}

	@Override
	public Integer next() {
		Integer value = list.get(index);
		index+=2;
		return value;
	}
	
}

public class IteratorDesignPattern 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		CustomeIterator iterator=new CustomeIterator(list);
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
