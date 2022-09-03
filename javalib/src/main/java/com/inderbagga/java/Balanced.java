package com.inderbagga.java;

import java.util.Scanner;
import java.util.Stack;

public class Balanced {

    public static void main(String[] args){

        System.out.println("Enter input:");
        String input = new Scanner(System.in).nextLine();
        String temp ;
        Stack<String> stack = new Stack();
        for(char item: input.toCharArray()){
           String value =  String.valueOf(item);
            switch (value){
                case "[":
                case "{":
                case "(":
                    stack.push(value);
                    break;
                case "]":
                    temp = stack.pop();
                    if(temp == "}"||temp == ")")
                        return;
                    break;
                case ")":
                    temp = stack.pop();
                    if(temp == "}"||temp == "]")
                        return;
                    break;
                case "}":
                    temp = stack.pop();
                    if(temp == ")"||temp == "]")
                        return;
                    break;
            }
        }

        if(stack.empty()){
            System.out.println("Balanced input.");
        }else System.out.println("Unevenness found.");
    }
}
