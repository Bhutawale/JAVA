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
interface inter
{
    public int square(int num);
}
public class FI_Ex3 
{
    public static void main(String[] args) {
        
    int n=123;
    
    inter i=(num)->{
        return num*num;
    };
    
        int square = i.square(n);
        System.out.println(square);
    }
}
