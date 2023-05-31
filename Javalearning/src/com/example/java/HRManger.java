package com.example.java;

public class HRManger extends Employee {

    public HRManger(double salary) {
        super(salary);
    }

    public void work() {
        System.out.println("HR manager is here !");
    }

    public void addEmployee() {
        System.out.println("This method to add new employee");
    }
}
