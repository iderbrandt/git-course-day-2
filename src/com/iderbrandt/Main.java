package com.iderbrandt;

public class Main {

    public static void main(String[] args) {
	int num = 15;
	int increment = increment(num);

        System.out.println(increment);
    }

    public static int increment(int number) {
        return ++number;
    }
}
