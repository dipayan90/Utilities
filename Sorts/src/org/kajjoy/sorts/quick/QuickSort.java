package org.kajjoy.sorts.quick;

/**
 * http://www.newthinktank.com/2013/03/java-quick-sort/
 * @author dipayan
 *
 */

public class QuickSort {
	
	private Integer[] array;
	
	public void setArray(Integer[] array){
		this.array = array;
	}
	
	public Integer[] sort(){
		int low = 0;
		int high = this.array.length-1;
		doSort(low,high);
		return this.array;
	}
	
	private void doSort(int low,int high){
		if(high-low<=0){
			return;
		}else{
			int pivot = this.array[high];
			int pivotLocation = partition(low,high,pivot);
			doSort(low,pivotLocation-1);
			doSort(pivotLocation+1,high);
		}
	}
	
	private int partition(int low,int high,int pivot){
		int i = low;
		int j = high;
		while(true){
			while(this.array[i]<pivot){
				i++;
			}
			
			while(this.array[j]>pivot){
				j--;
			}
			
			if(j-i <=0){
				break;
			}else{
				swap(i,j);
			}
		}
		return i;
	}
	
	private void swap(int i,int j){
		int temp = this.array[i];
		this.array[i] = this.array[j];
		this.array[j] = temp;
	}

}
