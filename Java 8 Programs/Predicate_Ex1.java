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
public class Predicate_Ex1 
{
    public static void main(String[] args) 
    {
        
        Predicate<Integer> p=n->(n>10);
        if(p.test(11))
        {
            System.out.println("Number is greater then 10");
        }
        else
        {
            System.out.println("Number is less then 10");
        }
    }
}
