/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_8_programs;

import java.util.function.Supplier;

/**
 *
 * @author Bhagyashri
 */
public class Random_Password_Generation_Using_Supplier 
{
    public static void main(String[] args)
    {
        Supplier<String> s=()->
        {
            Supplier<Integer> d=()->(int)(Math.random()*10);
            String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
            Supplier<Character> c=()->symbols.charAt((int)(Math.random()*29));
            String pwd="";
            for(int i=0;i<8;i++)
            {
                if(i%2==0)
                {
                    pwd=pwd+d.get();
                }
                else
                {
                    pwd=pwd+c.get();
                }
            }
            return pwd;
        };
                System.out.println(s.get());
                System.out.println(s.get());
                System.out.println(s.get());
                System.out.println(s.get());
                System.out.println(s.get());
                System.out.println(s.get());
    }
}
