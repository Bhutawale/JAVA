/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_core_programs;

import java.util.Scanner;

/**
 *
 * @author Bhagyashri
 */
public class PerfectSquare 
{
    static boolean checkPerfectSquare(int num)
    {
        if(num>0)
        {
            int sqrt=(int)Math.sqrt(num);
            if(sqrt*sqrt==num)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter the number: ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        
        if(checkPerfectSquare(num))
        {
            System.out.println(num+" is a Perfect Square.");
        }
        else
        {
            System.out.println(num+" is not a Perfect Square.");
        }
    }
}
