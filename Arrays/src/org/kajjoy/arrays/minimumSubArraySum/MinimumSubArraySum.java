package org.kajjoy.arrays.minimumSubArraySum;

import java.util.Arrays;

/**
 * Created by dipayan on 9/11/16.
 *
 * input : [2,3,1,2,4,3] target: 7 Res: 4,3
 * input: [2,3,1,2,4,1] target: 7 Res: 1,2,4
 */
public class MinimumSubArraySum {

    public static Integer[] calculate(Integer[] array,int target){

        int MAX_WINDOW_SIZE = array.length-1;
        int window_size = 0;
        int start_index = 0;
        int end_index = 0;
        while((window_size < MAX_WINDOW_SIZE)){
            end_index = start_index + window_size;
            Integer[] arr = Arrays.copyOfRange(array,start_index,end_index+1);
            if(sum(arr,arr.length-1) >= target){
                break;
            }
            start_index++;
            if(end_index == array.length -1 ){
                start_index = 0;
                window_size++;
            }
        }
        return Arrays.copyOfRange(array,start_index,end_index+1);
    }

    private static int sum(Integer[] arr,int len){
        if(len == 0){
            return arr[0];
        }
        return arr[len] + sum(arr,len-1);
    }
}
