package org.kajjoy.arrays.binarySearch;

import java.util.Arrays;

/**
 * Created by dipayan on 8/30/16.
 */
public class BinarySearch {

    public static int search(Integer[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        Arrays.sort(arr);
        return binarySearch(arr,start,end,target);
    }

    private static int binarySearch(Integer[] array,int start,int end,int target){
        int mid = (start + end)/2;
        if(array[mid] == target){
            return mid;
        }
        if(target < array[mid]){
            return binarySearch(array,0,mid-1,target);
        }else{
            return binarySearch(array,mid+1,end,target);
        }
    }
}
