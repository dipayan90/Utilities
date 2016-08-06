package org.kajjoy.arrays.nthLargest;

import org.kajjoy.arrays.Runner;

import java.util.Scanner;

/**
 * Created by chattod on 8/5/16.
 */
public class NthLargestRunner implements Runner {
    @Override
    public void run() {
        System.out.println("Please enter the array for which we want to find the nth largest number: \n");
        System.out.println("Please enter the numbers separated by commas \n");
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        Integer[] nums = convertStringToArray(s);
        System.out.println("In Kth largest number, please enter the value of k: \n");
        Scanner scn1 = new Scanner(System.in);
        int k = scn1.nextInt();
        int num = NthLargest.find(nums,k);
        System.out.println("The "+k+"th largets number is: "+ num);
    }


    private Integer[] convertStringToArray(String s){
        String[] splits = s.split(",");
        Integer[] res = new Integer[splits.length];
        int index = 0;
        for(String seg: splits){
            res[index++] = Integer.parseInt(seg);
        }
        return res;
    }
}
