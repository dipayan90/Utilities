package org.kajjoy.arrays.nthLargest;

/**
 * Created by chattod on 8/5/16.
 */
public class NthLargest {

    protected static int find(Integer[] numbers,int k){
        int[] tracker = new int[k];
        int index = 0;
        while(index < numbers.length){
            int secIndex = 0;
            while(secIndex < k){
                if(numbers[index] > tracker[secIndex]){
                    tracker[secIndex] = numbers[index];
                    break;
                }
                secIndex++;
            }
            index++;
        }
        return tracker[k-1];
    }
}
