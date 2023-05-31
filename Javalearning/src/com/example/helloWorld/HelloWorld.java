package com.example.helloWorld;

public class HelloWorld {
    public static void main(String args[]) {
        Loops loop = new Loops();
        System.out.println("for loop example:");
        loop.runLoops(10);
        System.out.println("while loop example:");
        loop.whileEX();
        System.out.println("do while loop example:");
        loop.doWhileEX();

        System.out.println("switch example:");
        SwitchCondition swit = new SwitchCondition();
        swit.dayOfTheWeek();

        System.out.println("single line example:");
        Conditions conditions = new Conditions();
        conditions.ternaryOperator();
    }
}
