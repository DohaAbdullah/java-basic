package com.example.java;

public class Enemy {
    private int health = 100;

    public void Talk() {
        System.out.println("Hey, I am the enemy !");
    }

    public void gethealth() {
        System.out.println(health);
    }

    public void setHealth(int h) {
        health = h;
    }
}
