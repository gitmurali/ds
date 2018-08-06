package com.murali;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        ArrayDeque<String> strings = new ArrayDeque<>();
        strings.add("murali");
        strings.add("prashanth");
        strings.add("nutalapati");
        System.out.println(strings.pop());
    }
}
