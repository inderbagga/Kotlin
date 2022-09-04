package com.inderbagga.java;

import java.util.Scanner;

public class NumberEntrypoint {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Numbers number = new Numbers();

        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();

        number.swap(a,b);
        number.swapTemp(a,b);
    }
}
