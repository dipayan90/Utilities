package org.kajjoy.arrays.mergeSortedArrays;

import org.kajjoy.arrays.Runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dipayan on 8/24/16.
 */
public class MergeSortedArraysRunner implements Runner {


    @Override
    public void run() {

        System.out.println("Please enter the first array: ");
        Scanner scn1 = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while(scn1.hasNextBigInteger()){
            list1.add(scn1.nextInt());
        }
        Integer[] arr1 = list2Array(list1);
        System.out.println("Array1 is: ");
        printArray(arr1);

        System.out.println("Please enter the 2nd array: ");
        Scanner scn2 = new Scanner(System.in);
        while (scn2.hasNextBigInteger()){
            list2.add(scn2.nextInt());
        }
        Integer[] arr2 = list2Array(list2);
        System.out.println("Array2 is: ");
        printArray(arr2);

        System.out.println("Sorting the given arrays");
        Arrays.sort(arr1); Arrays.sort(arr2);

        Integer[] mergedArray = MergeSortedArrays.merge(arr1,arr2);

        System.out.println("The merged array is: ");
        printArray(mergedArray);


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
