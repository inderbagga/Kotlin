package com.inderbagga.java;

import java.util.HashMap;
import java.util.Map;

public class Numbers {

    public void swapAS(int a, int b){
        System.out.println("Swapping with + - arithmetic operators");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+a +" and b = "+b);
    }

    public void swapMD(int a, int b){
        System.out.println("Swapping with * / arithmetic operators");
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("a = "+a +" and b = "+b);
    }

    public void swapXor(int a, int b){
        System.out.println("Swapping with bitwise xor");
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = "+a +" and b = "+b);
    }

    public void swapLine(int x, int y){
        System.out.println("Swapping in one line");
        x = x ^ y ^ (y = x);
        System.out.println(
                "After Swapping values"
                        +" of x and y are " + x
                        + " and " + y +" respectively.");
    }

    void swapTemp(int a, int b){
        System.out.println("Swapping with temporary variable");
        int c = a;
        a = b;
        b = c;
        System.out.println("a = "+a +" and b = "+b);
    }

    void winningCard(int[][] setList){
        int highestCard = -1;
        for(int[] cardSet: setList){
            Map<Integer,Integer> counts = new HashMap<>();
            for(int card: cardSet){
                if(counts.containsKey(card)){
                    counts.put(card, counts.get(card)+1);
                }
                else counts.put(card, 1);
            }
            for(Map.Entry<Integer,Integer> entry: counts.entrySet()){
                if(entry.getValue()==1){
                    highestCard=Math.max(entry.getKey(),highestCard);
                }
            }
        }

        System.out.println("Winner card is :"+highestCard);
    }
}