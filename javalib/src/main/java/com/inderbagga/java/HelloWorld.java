package com.inderbagga.java;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] arg){

        System.out.println("Hello World");
        System.out.println("Please type your input string:");

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] commands = input.split(" ");

        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<commands.length;i++){
            switch (commands[i]){
                case "+":
                    if(temp.size()>1){
                        int a = temp.get(temp.size()-1);
                        int b = temp.get(temp.size()-2);
                        temp.add(a+b);
                    }
                    break;

                case "D":
                    if(temp.size()>0){
                        int num = temp.get(temp.size()-1);
                        temp.add(num*2);
                    }
                    break;

                case "C":
                    if(temp.size()>0){
                        temp.remove(temp.size()-1);
                    }
                    break;

                default:
                    temp.add(Integer.parseInt(commands[i]));
                    break;
            }
        }
        int result = 0;
        for(int i=0; i<temp.size();i++){
            result += temp.get(i);
        }
        System.out.println("Result: "+result);
    }
}