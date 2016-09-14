package org.kajjoy.arrays.minimumSubArraySum;

import org.kajjoy.arrays.Runner;

import java.util.Scanner;

/**
 * Created by dipayan on 9/11/16.
 *
 * Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.

 For example, given the array [2,3,1,2,4,3] and s = 7, the subarray [4,3] has the minimal length of 2 under the problem constraint.
 */
public class MinimumSubArraySumRunner implements Runner {

    @Override
    public void run() {
        System.out.println("Please enter the integer array: ");
        Scanner scn = new Scanner(System.in);
        String arrayElements = scn.next();
        Integer[] array = stringToArray(arrayElements);
        System.out.println("The entered array is: ");
        print(array);
        System.out.println("Please enter the target value: ");
        Scanner scn1 = new Scanner(System.in);
        int target = scn1.nextInt();
        Integer[] resultingArr =  MinimumSubArraySum.calculate(array,target);
        System.out.println("The resulting minumum sum sub array is: ");
        print(resultingArr);
    }

    private Integer[] stringToArray(String s){
        String[] segs = s.split(",");
        Integer[] arr = new Integer[segs.length];
        int index = 0;
        for(String seg: segs){
            arr[index++] = Integer.parseInt(seg);
        }
        return arr;
    }

    private void print(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
