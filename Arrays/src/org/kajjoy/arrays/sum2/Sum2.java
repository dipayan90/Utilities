package org.kajjoy.arrays.sum2;

import java.util.Arrays;

public class Sum2 {

    public static int[] compute(Integer[] array,int target){
        Arrays.sort(array);
        int i=0,j=array.length-1;
        while(i<j){
            if(array[i]+array[j]==target){
                break;
            }if(target > array[i]+array[j]){
                i++;
            }else if(target < array[i] + array[j]){
                j--;
            }
        }

        return new int[]{array[i],array[j],array[i]+array[j]};
    }
}
