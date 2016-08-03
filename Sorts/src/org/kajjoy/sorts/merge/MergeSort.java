package org.kajjoy.sorts.merge;

public class MergeSort {
	
	protected static Integer[] sort(Integer[] numbers){
		int low =0;
		int high = numbers.length;
		mergeSort(numbers,low,high);
		return numbers;
	}
	
	private static void mergeSort(Integer[] array,int low,int high){
		System.out.println("low");
		System.out.println(low);
		System.out.println("high");
		System.out.println(high);
		if(low>=high){
			return;
		}else{
			int mid = (low+high)/2;
			mergeSort( array, low, mid);
			mergeSort( array, mid+1, high);
			merge(array,low,mid,high);
		}
	}
	
	private static void merge(Integer[] array,int low,int mid,int high){
		Integer[] tempArray = new Integer[high];
		int i = low;
		int j = mid+1;
		int index=0;
		while(i<mid && j< high){
			if(array[i]<array[j]){
				tempArray[index++] = array[i];
				i++;
			}
			else if(array[j]<array[i]){
				tempArray[index++] = array[j];
				j++;
			}
		}
		
		while(i <mid){
			tempArray[index++] = array[i];
			i++;
		}
		while(j<high){
			tempArray[index++] = array[j];
			j++;
		}
	}

}
