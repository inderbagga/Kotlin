package com.inderbagga.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args){

        System.out.println("Please enter input:");
        String input = new Scanner(System.in).nextLine();

        Map<Character,Integer> dataMap = new HashMap();
        for(char value : input.toCharArray()){
            if(dataMap.containsKey(value)){
                dataMap.put(value,dataMap.get(value)+1);
            }else dataMap.put(value,1);
        }

        for(Map.Entry entrySet : dataMap.entrySet()){
            if(Integer.parseInt(entrySet.getValue().toString())>1){
                System.out.println(entrySet.getKey()+" appear "+entrySet.getValue()+ " times.");
            }
        }
    }
}