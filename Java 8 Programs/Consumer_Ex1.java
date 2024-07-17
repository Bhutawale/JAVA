/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author Bhagyashri
 */
class Person        
{
    String name;
    int salary;
    
    Person(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }
}
public class Consumer_Ex1 
{
    //task 1 :Calculate the bonus using function
    //task 2 :Check if bonus greater than 5000 using Predicate
    //task 3 :Display result using Consumer
  
    public static void main(String[] args) 
    {
        List<Person> list = Arrays.asList(
                new Person("Satish", 70000),
                new Person("Sagar", 40000),
                new Person("Nitin", 30000),
                new Person("Aman", 20000)
        );
  
    Function<Person, Integer> f=p->(p.salary*10)/100;
    
    Predicate<Integer> p=b-> b>5000;
    
    Consumer<Person> c=per->{
        System.out.println(per.name);
        System.out.println(per.salary);
    };
    
    for(Person person:list)
    { 
        Integer bonus = f.apply(person);
        if(p.test(bonus))
        {
            c.accept(person);
            System.out.println("Bonus is"+bonus);
        }
    }  
        }
}
