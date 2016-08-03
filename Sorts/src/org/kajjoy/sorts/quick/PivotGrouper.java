package org.kajjoy.sorts.quick;

/**
 * Given an array and a pivot element group all elements less than the element to the left and
 * the ones greater on the right
 * @author dipayan
 *
 */

public class PivotGrouper {
	
	public static Integer[] group(Integer[] array,int pivot){
		int i =0;
		int j = array.length - 1;
		
		while(true){
			
			while(i<array.length && array[i]<pivot){
				i++;
			};
			
			while(j>0 && array[j]>pivot){
				j--;
			};
			
			if(i>j){
				break;
			}else{
				swap(array,i,j);
			}
		}
		return array;
	}
	
	private static void swap(Integer[] array,int i,int j){
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}

}
