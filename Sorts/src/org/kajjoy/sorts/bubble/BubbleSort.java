package org.kajjoy.sorts.bubble;

public class BubbleSort {
	
	protected static Integer[] sort(Integer[] array){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[i]){
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

}
