/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_core_programs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bhagyashri
 */
public class PrimeNumberBetweenGivenRange
{
    static List<Integer> primeNumbers(int start,int end)
    {
        List<Integer> list=new ArrayList<>();
        
        for(int i=start;i<=end;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                   count++;
                }
            }
            if(count==2)
            {
                list.add(i);
            }
        }
        
        return list;
    }
    public static void main(String[] args) 
    {
        System.out.println("Printing Prime Numbers between 1 and 100");
        int start=1;
        int end=100;
        List<Integer> primeNumbers = primeNumbers(start,end);
        for(int n:primeNumbers)
        {
            System.out.println(n);
        }
    }
}
