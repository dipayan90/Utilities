package org.kajjoy.arrays.binarySearch;

import org.kajjoy.arrays.Runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dipayan on 8/30/16.
 */
public class BinarySearchRunner implements Runner {

    @Override
    public void run() {

        System.out.println("Please enter the array you wanna sort: ");
        Scanner scn = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(scn.hasNextBigInteger()){
            list.add(scn.nextInt());
        }
        Integer[] arr = listToArray(list);

        System.out.println("Please enter your target number: ");
        Scanner scn1 = new Scanner(System.in);

        System.out.println("Entered array is: ");
        printArray(arr);

        System.out.println("Starting search ......");
        int index  =  BinarySearch.search(arr,scn1.nextInt());

        System.out.println("Index of target is: ");
        System.out.print(index);
    }

    private Integer[] listToArray(List<Integer> list){
        Integer[] array = new Integer[list.size()];
        return list.toArray(array);
    }

    private void printArray(Integer[] arr){
        int i =0;
        System.out.println("[ ");
        while(i < arr.length){
            System.out.println(arr[i++]);
        }
        System.out.println(" ]");
    }
}
