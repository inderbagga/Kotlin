package com.inderbagga.java;

import java.util.HashSet;

public class HashSetExample
{
    public static void main(String args[])
    {
        //creating object of HashSet
        HashSet<String> hs= new HashSet<String>();
        //adding values to HashSet
        hs.add("Java");
        hs.add("Python");
        hs.add("C++");
        hs.add("C");
        System.out.println("Before adding duplicate and null values: ");
        System.out.println(hs);
        //adding duplicate values
        hs.add("Python");
        hs.add("C");
        System.out.println("After adding duplicate values: ");
        System.out.println(hs);
        //adding null values
        hs.add(null);
        hs.add(null);
        System.out.println("After adding null values: ");
        System.out.println(hs);
    }
}