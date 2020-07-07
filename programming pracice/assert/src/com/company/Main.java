package com.company;

public class Main {
    static int val = 3;
    // Return an integer.
    static int getnum() {
        return val--;
    }
    public static void main(String[] args) {
       int value = 15;
        assert value >= 20 : " Underweight";
        System.out.println("value is "+value);
    }}
