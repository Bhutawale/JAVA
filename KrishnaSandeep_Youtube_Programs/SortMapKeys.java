package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapKeys 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(10, "satish");
		map.put(3, "Kiran");
		map.put(2, "sagar");
		map.put(20, "suyog");
		
		Map<Integer, String> smap=new TreeMap<>();
		
		for(Map.Entry<Integer, String> entry:map.entrySet())
		{
			smap.put(entry.getKey(), entry.getValue());
		}
		
		for(Map.Entry<Integer, String> e:smap.entrySet())
		{
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}
}
