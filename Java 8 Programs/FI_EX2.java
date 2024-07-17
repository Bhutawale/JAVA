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
interface cab1
{
    public void bookcab(String source,String destination);
}
//class ola implements cab1
//{
//    public void bookcab(String source,String destination)
//    {
//        System.out.println("Ola is booked from "+source+" to "+ destination);
//    }
//}
public class FI_EX2 
{
    public static void main(String[] args) 
    {
        cab1 c=(source,destination)->System.out.println("Ola is booked from "+source+" to "+ destination);
        c.bookcab("Karjat", "Pune");
    }
}
