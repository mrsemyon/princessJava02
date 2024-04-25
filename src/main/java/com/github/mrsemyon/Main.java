package com.github.mrsemyon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 10, 20, 30, 40, 50, 51));
        System.out.println(numbers);
        System.out.println("Is array contains duplicate number: " + isDuplicateNumber(numbers));
    }
    public static String isDuplicateNumber(ArrayList<Integer> numbers){
        Set<Integer> newNumbers = new HashSet<Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            if (!newNumbers.contains(numbers.get(i))){
                newNumbers.add(numbers.get(i));
            } else
                return "true";
        }
        return "false";
    }
}
