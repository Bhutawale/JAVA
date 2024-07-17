/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_8_programs;

import java.util.function.Function;

/**
 *
 * @author Bhagyashri
 */
public class Function_Ex1 
{
    public static void main(String[] args) 
    {
        //Ex 1
        Function<Integer, Integer> f=n->n*n;
        System.out.println(f.apply(4));
        
        //Ex 2
        Function<String,Integer> f1=s->s.length();
        System.out.println(f1.apply("satish"));
    }
}
