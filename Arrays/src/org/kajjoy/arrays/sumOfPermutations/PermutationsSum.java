package org.kajjoy.arrays.sumOfPermutations;

import java.util.List;
import java.util.stream.Collectors;

public class PermutationsSum {

    public static Integer sum(Integer num){
        if(num == null){
            return 0;
        }
        return 0;
    }

    public static void printPermutations(Integer num){
        System.out.println("Input number is: "+ num);
        System.out.println("Digits on your number are: ");
        getDigits(num).stream().forEach(e -> System.out.println("[ " + e+ " ]"));
    }

    private static List<Integer> getDigits(Integer num){
        String numString = Integer.toString(num);
       return numString.chars()
                .mapToObj(e -> Integer.valueOf(String.valueOf( e)))
                .collect(Collectors.toList());
    }

}
