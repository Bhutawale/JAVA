/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author Bhagyashri
 */
class Teacher
{
    String name;
    int salary;
    
    Teacher(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }
}
public class Function_Ex2 
{
    public static void main(String[] args) 
    {
        List<Teacher> list = Arrays.asList(
                new Teacher("Satish", 50000),
                new Teacher("Sagar", 30000),
                new Teacher("Nitin", 25000),
                new Teacher("Aman", 45000),
                new Teacher("Baban", 20000)
        );
        
        Function<Teacher,Integer> f=t->
            {
            int sal = t.salary;
            int bonus;
            if(sal>10000 && sal<25000)
                {
                    bonus=sal*10/100;
                }
            else if(sal>25000 && sal<35000)
            {  
                bonus=sal*20/100;
            }
            else if(sal>35000 && sal<55000)
            {
                bonus=sal*30/100;
            }
            else
            {
                bonus=sal*35/100;
            }
            return bonus;
            };
        
        Predicate<Integer> p=b->b>5000;
        
        for(Teacher te:list)
        {
            int emp_bonus  = f.apply(te);
            
            if(p.test(emp_bonus))
            {
                System.out.println(te.name+" "+te.salary);
                System.out.println(emp_bonus);
            }
            
        }
    }
}
