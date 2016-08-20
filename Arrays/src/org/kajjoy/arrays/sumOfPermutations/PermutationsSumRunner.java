package org.kajjoy.arrays.sumOfPermutations;

import org.kajjoy.arrays.Runner;

import java.util.Scanner;


public class PermutationsSumRunner implements Runner {

    @Override
    public void run() {

        System.out.println("Please enter the number n for which you want to find sum of all possible permutations: \n");
        Scanner scn = new Scanner(System.in);
        Integer number = scn.nextInt();
        PermutationsSum.printDigits(number);
        System.out.println(PermutationsSum.sum(number));
    }
}
