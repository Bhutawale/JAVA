/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_8_programs;

import java.util.function.Predicate;

/**
 *
 * @author Bhagyashri
 */
public class Predicate_Ex2 
{
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        
        Predicate<Integer> p=n->n%2==0;
        
        //Even Numbers
        for(int num:arr)
        {
            if(p.test(num))
            {
                System.out.println(num);
            }
        }
        
        //Odd Numbers using negate function
        System.out.println("----------------------");
        for(int num:arr)
        {
            if(p.negate().test(num))
            {
                System.out.println(num);
            }
        }
        System.out.println("----------------------");
       
        //Checking for two conditions
        Predicate<Integer> p1=n->n>3 && n<8;
        for(int num:arr)
        {
            if(p1.test(num))
            {
                System.out.print(num+" ");
            }
        }
        
        System.out.println("------------------------");
        //Checking for either conditions
        Predicate<Integer> p2=n-> n%2==0 || n%5==0; 
        for(int num:arr)
        {
            if(p2.test(num))
            {
                System.out.print(num+ " ");
            }
        }
    }
}
