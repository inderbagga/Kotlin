package com.inderbagga.java;

public class Numbers {

    public void swap(int a, int b){
        System.out.println("Swapping with + - arithmetic operators");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+a +" and b = "+b);
    }

    void swapTemp(int a, int b){
        System.out.println("Swapping with temporary variable");
        int c = a;
        a = b;
        b = c;
        System.out.println("a = "+a +" and b = "+b);
    }
}