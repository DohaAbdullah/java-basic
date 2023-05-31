package com.example.helloWorld;

import java.util.Scanner;

public class Examples {

    static int min(int n1, int n2, int n3) {
        int min = n1;

        if (min > n2)
            min = n2;
        if (min > n3)
            min = n3;
        return min;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the #1 number :");
        int x = in.nextInt();
        System.out.println("Enter the #2 number :");
        int y = in.nextInt();
        System.out.println("Enter the #3 number :");
        int z = in.nextInt();
        int minimum = min(x, y, z);
        System.out.println(minimum);

    }
}
