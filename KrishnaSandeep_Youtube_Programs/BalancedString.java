package com.java_core_programs;

import java.util.Stack;

public class BalancedString 
{
    static boolean wellFormedString(String str)
    {
        Stack<Character> stack = new Stack<>();
        char[] charArr = str.toCharArray();

        for(char c : charArr)
        {
            if(c == '{' || c == '[')
            {
                stack.push(c);
            }
            else if(c == '}' || c == ']')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top = stack.pop();
                if((c == '}' && top != '{') || (c == ']' && top != '['))
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) 
    {
        String str = "{{{[]}}}";
        boolean isWellFormed = wellFormedString(str);
        if(isWellFormed)
        {
            System.out.println("String is Balanced");
        }
        else
        {
            System.out.println("String is Not Balanced");
        }
    }
}
