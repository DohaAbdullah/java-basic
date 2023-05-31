package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class MapEx {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(788);
        secondList.addAll(integerList);
        System.out.println(secondList);
    }
}
