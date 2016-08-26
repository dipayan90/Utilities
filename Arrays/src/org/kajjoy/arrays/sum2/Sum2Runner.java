package org.kajjoy.arrays.sum2;

import org.kajjoy.arrays.Runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given an array and a target number this program finds 2 numbers from the array that are closest to the sum
 */
public class Sum2Runner implements Runner {
    @Override
    public void run() {

        System.out.println("Please enter the array : \n");
        Scanner scn = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();
        while(scn.hasNextBigInteger()){
            input.add(scn.nextInt());
        }
        Integer[] array = list2Array(input);
        System.out.println("Your input array is: \n");
        printArray(array);
        System.out.println("Please enter the target sum: ");
        Scanner scn1 = new Scanner(System.in);
        int target = scn1.nextInt();
        System.out.println("The target number is: "+ target);
        int[] res =  Sum2.compute(array,target);
        System.out.println("Numbers are: "+ res[0] + " and " + res[1]);
        System.out.println("Nearest sum is: "+ res[2]);
    }

    private Integer[] list2Array(List<Integer> list){
        Integer[] array = new Integer[list.size()];
        return list.toArray(array);
    }

    private void printArray(Integer[] array){
        System.out.println("[ ");
        for(int i: array){
            System.out.println(i);
        }
        System.out.println(" ]");
    }


}
