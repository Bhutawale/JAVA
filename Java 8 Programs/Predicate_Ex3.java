/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Bhagyashri
 */
class Employee
{
    int id;
    String name;
    int salary;
    
    Employee(int id,String name,int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
public class Predicate_Ex3 
{
    public static void main(String[] args) 
    {
        Employee emp=new Employee(111, "Satish Bhutawale", 45000);
        
        Predicate<Employee> p=e->e.salary>30000 && e.name.startsWith("R");
        
        if(p.test(emp))
        {
            System.out.println(emp.name);
        }
        System.out.println("-------------------------");
        
        List<Employee> list = Arrays.asList(
                new Employee(121, "Raju", 25000),
                new Employee(131, "Karan", 35000),
                new Employee(141, "Ram", 45000),
                new Employee(151, "Sagar", 55000));
        
        for(Employee e:list)
        {
            if(p.test(e))
            {
                System.out.println(e.name);
            }
        }
    }
}
