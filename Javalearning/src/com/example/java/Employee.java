package com.example.java;

public class Employee {

    double salary;
    public Employee(double salary){
        this.salary = salary;

    }
    public void work(){
        System.out.println("I'm the employee!");
    }

    public double getSalary(){
        return salary;
    }
}
