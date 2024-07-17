/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_8_programs;

import java.util.Date;
import java.util.function.Supplier;

/**
 *
 * @author Bhagyashri
 */
public class Supplier_Ex1 
{
    public static void main(String[] args) 
    {
        Supplier<Date> s=()->new Date();
        System.out.println(s.get());
    }
}
