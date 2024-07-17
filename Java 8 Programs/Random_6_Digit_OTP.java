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
public class Random_6_Digit_OTP 
{
    public static void main(String[] args) 
    {
        Supplier<String> s=()->
        {
            String otp="";
            for(int i=0;i<6;i++)
            {
                otp=otp+(int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(s.get());
        
    }
}
