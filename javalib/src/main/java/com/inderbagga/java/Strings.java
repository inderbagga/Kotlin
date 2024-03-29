package com.inderbagga.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {

    void uniqueWord(String input){
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(input);

        HashMap<String, Integer> hm = new HashMap<>();

        while(m.find()){
            String word = m.group();
            if(hm.containsKey(word)){
                hm.put(word,hm.get(word)+1);
            }else hm.put(word,1);
        }

        Set<String> dataSet = hm.keySet();
        Iterator<String> i = dataSet.iterator();

        System.out.println("Unique words are:");

        while(i.hasNext()){
            String word = i.next();
            if(hm.get(word) == 1){
                System.out.println(word);
            }
        }
    }

    void findDuplicate(String input){
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

    void checkIfBalanced(String input){
        String temp ;
        boolean flag = true;
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
                    if(stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    temp = stack.pop();
                    if(Objects.equals(temp, "}") || Objects.equals(temp, ")")){
                        flag = false;
                        break;
                    }
                    break;
                case ")":
                    if(stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    temp = stack.pop();
                    if(Objects.equals(temp, "}") || Objects.equals(temp, "]")){
                        flag = false;
                        break;
                    }
                    break;
                case "}":
                    if(stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    temp = stack.pop();
                    if(Objects.equals(temp, ")") || Objects.equals(temp, "]")){
                        flag = false;
                        break;
                    }
                    break;
            }
        }

        if(stack.empty()&&flag){
            System.out.println("Balanced input.");
        }else System.out.println("Unevenness found.");
    }

    void customOperation(String input){
        String[] commands = input.split(" ");

        ArrayList<Integer> temp = new ArrayList<>();
        for (String command : commands) {
            switch (command) {
                case "+":
                    if (temp.size() > 1) {
                        int a = temp.get(temp.size() - 1);
                        int b = temp.get(temp.size() - 2);
                        temp.add(a + b);
                    }
                    break;

                case "D":
                    if (temp.size() > 0) {
                        int num = temp.get(temp.size() - 1);
                        temp.add(num * 2);
                    }
                    break;

                case "C":
                    if (temp.size() > 0) {
                        temp.remove(temp.size() - 1);
                    }
                    break;
                default:
                    temp.add(Integer.parseInt(command));
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