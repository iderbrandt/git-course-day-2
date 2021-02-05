package com.iderbrandt;

public class Main {

    public static void main(String[] args) {
        //GIT Course Day 2!

        int num = 15;
        int increment = increment(num);
        int decrement = decrement(increment);

        int newNumber = decrement(decrement);

        System.out.println(increment);
        System.out.println(newNumber);

    }

    public static int increment(int number) {
        return ++number;
    }

    public static int decrement(int number) {
        return --number;
    }
}
