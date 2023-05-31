package com.example.helloWorld;

import java.util.Scanner;

public class Loops {
    public void runLoops(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }

    public void whileEX() {
        int p = 0;
        while (p < 5) {
            System.out.println(p);
            p++;
        }
    }

    public void doWhileEX() {
        int c = 0;
        System.out.println("Please enter a character :");
        Scanner in = new Scanner(System.in);

        char letter;
        do {
            letter = in.next().charAt(0);
            c++;
        } while (letter != 'p');
    }
}
