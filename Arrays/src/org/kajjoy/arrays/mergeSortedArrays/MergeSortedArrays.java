package org.kajjoy.arrays.mergeSortedArrays;

/**
 * Created by dipayan on 8/24/16.
 */
public class MergeSortedArrays {

    public static Integer[] merge(Integer[] arr1,Integer[] arr2){
        if(arr1 == null && arr2==null){
            return null;
        }
        if(arr1 == null){
            return arr2;
        }
        if(arr2 == null){
            return arr1;
        }
        int totallen = arr1.length + arr2.length;
        Integer[] result = new Integer[totallen];
        int final_pointer = 0,first_pointer = 0,second_pointer = 0;
        while(final_pointer < totallen){
            if(arr1[first_pointer] < arr2[second_pointer]){
                result[final_pointer++] = arr1[first_pointer++];
            }else if(arr1[first_pointer] > arr2[second_pointer]){
                result[final_pointer++] = arr2[second_pointer++];
            }
            if(first_pointer > arr1.length-1){
                result[final_pointer++] = arr2[second_pointer++];
            }else if(second_pointer > arr2.length-1){
                result[final_pointer++] = arr1[first_pointer++];
            }
        }
        return result;
    }
}
