/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_core_programs;

import java.util.Stack;

/**
 *
 * @author Bhagyashri
 */
public class WellFormedString 
{
    static boolean wellFormedString(String str)
    {
        Stack<Character> stack=new Stack();
        int balCount=0;
        char[] charArr = str.toCharArray();
        for(char c:charArr)
        {
          if(c=='{' || c=='[')
              balCount++;
          else if(c=='}'||c==']')
              balCount--;
          else
              return false;
        }
        if(balCount==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        String str="{{[]}}";
        boolean iswellformed = wellFormedString(str);
        if(iswellformed)
        {
            System.out.println("String is Balanced");
        }
        else
        {
            System.out.println("String is Not Balanced");
        }
    }
}
