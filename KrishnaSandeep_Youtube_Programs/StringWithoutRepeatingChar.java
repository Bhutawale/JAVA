package com.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringWithoutRepeatingChar 
{
	static Set<Character> lengthOfStringWithoutRepeatingChar(String s)
	{
		Set<Character> set=new LinkedHashSet<Character>();
		
		char[] arr = s.toCharArray();
		
		for(char c:arr)
		{
			if(!set.contains(c))
			{
				set.add(c);
			}
		}
		System.out.println(set+" Length="+set.size());
		return set;
	}
	public static void main(String[] args) 
	{
		String s1 = "abcabcbb"; // Expected: "abc", length 3 
		String s2 = "bbbbb"; // Expected: "b", length 1 
		String s3 = "pwwkew"; // Expected: "pwke", length 4 
		String s4 = ""; // Expected: "", length 0
		lengthOfStringWithoutRepeatingChar(s1);
		lengthOfStringWithoutRepeatingChar(s2);
		lengthOfStringWithoutRepeatingChar(s3);
		lengthOfStringWithoutRepeatingChar(s4);
		
	}
}
