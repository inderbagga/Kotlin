package com.inderbagga.java;

import java.util.Scanner;

public class StringEntrypoint {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Strings string = new Strings();

        System.out.println("Enter input:");
        String input = scanner.nextLine();

        string.uniqueWord(input);
    }
}
