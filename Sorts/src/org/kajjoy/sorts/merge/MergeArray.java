package org.kajjoy.sorts.merge;

public class MergeArray {
	
	public static Integer[] merge(Integer[] arr1,Integer[] arr2){
		int len1 = arr1.length;
		int len2 = arr2.length;
		int totalLength = len1 + len2;
		Integer[] res = new Integer[totalLength];
		int i=0;int j=0;int index=0;
		while(i<len1 && j<len2){
			if(arr1[i]<arr2[j]){
				res[index++] = arr1[i];
				i++;
			}
			else if(arr2[j]<arr1[i]){
				res[index++] = arr2[j];
				j++;
			}
		}
			while(i<len1){
				res[index++]=arr1[i];
				i++;
			}
			while(j<len2){
				res[index++]=arr2[j];
				j++;
			}
		
		
		return res;
	}

}
