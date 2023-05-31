package com.example.java;

public class Rectangle extends Shape {

    public double length;
    public double width;

    public Rectangle(double l , double w) {
        this.length = l;
        this.width = w;
    }

    public double getArea(){
        return length + width;
    }


}
