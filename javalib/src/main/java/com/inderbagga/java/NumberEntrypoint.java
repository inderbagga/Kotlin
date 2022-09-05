package com.inderbagga.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberEntrypoint {

    public static void main(String[] args){

        Numbers number = new Numbers();

        List<List<Integer>> testCase = new ArrayList<>();
        testCase.add(Arrays.asList(5,7,3,9,4,9,8,3,1));
        testCase.add(Arrays.asList(1,2,2,4,4,1));
        testCase.add(Arrays.asList(1,2,3));

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();*/

        System.out.println("Enter input:");
        String input = scanner.nextLine();

        String[] arrays = input.split(",");
        int[][] cards= new int[arrays.length][4];

        for(int index = 0; index<arrays.length; index++){
            String[] card = arrays[index].split(" ");
            for(int item = 0; item< card.length; item++){
                cards[index][item] = Integer.parseInt(card[item]);
            }
        }

        number.winningCard(cards);
    }
}
