package org.kajjoy.arrays.bitCount;

/**
 * Given a number, convert it into binary.with one change i.e flip [index1,index2]
 * change the array so that you have maximum number of set bits i.e ones.
 * Find the max value is.
 * 
 * Example: 10 -> 1010 -> one flip: 1110 -> result 3
 * 8 -> 1000 -> one flip: 1111 -> result 4
 * @author dipayan
 *
 */

public class BitCount {
	
	protected static int getCountofHighestNumberOfSetBits(int number){
		String binaryString = Integer.toBinaryString(number);
		Integer[] byteArray = convertStringToIntArray(binaryString);
		int max = 0;
		for(int i=0;i<byteArray.length;i++){
			for(int j=i+1;j<byteArray.length;j++){
				Integer[] temp = flip(byteArray.clone(),i,j);
				int count = countOnes(temp);
				if(count > max){
					max = count;
				}
			}
		}
		return max;
	}
	
	private static Integer[] convertStringToIntArray(String s){
		Integer[] res = new Integer[s.length()];
		for(int i=0;i<s.length();i++){
			res[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		return res;
	}
	
	private static Integer[] flip(Integer[] array,int start,int end){
		for(int i=start;i<=end;i++){
			if(array[i] == 0){
				array[i] = 1;
			}else{
				array[i] = 0;
			}
		}
		return array;
	}
	
	private static int countOnes(Integer[] array){
		int count = 0;
		for(int i: array){
			if(i == 1){
				count++;
			}
		}
		return count;
	}

}
