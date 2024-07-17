/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_8_programs;

/**
 *
 * @author Bhagyashri
 */

@FunctionalInterface
interface cab
{
    public void bookcab();
}
//class ola implements cab
//{
//    public void bookcab()
//    {
//        System.out.println("Ola is booked");
//    }
//}
public class FI_Ex1 
{
    public static void main(String[] args) 
    {
        cab c=()->System.out.println("Ola is booked");
        c.bookcab();
    }
}
