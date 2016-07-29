package org.kajjoy.arrays.sumchecker;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array, find first sequence of consecutive 
 * numbers that match a given sum
 * @author dipayan
 *
 */

public class SumChecker {
	
	protected static List<Integer> getNumbers(int[] array,int target){
		int len = array.length;
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<len;i++){
			int k =i+1;
			list.clear();
			list.add(array[i]);
			int temp = array[i];
			while((temp <= target) && k<len){
				temp += array[k];
				list.add(array[k]);
				if(temp == target){
					return list;
				}
				k++;
			}
			
		}
		return list;
		
	}

}
