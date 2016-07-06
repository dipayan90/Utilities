package org.kajjoy.arrays.detectDuplicates;

public class DetectDuplicates {
	
	protected static boolean isDuplicate(String str){
		char[] charArray = str.toCharArray();
		boolean[] boolArray = new boolean[256];
		for(char c: charArray){
			if(boolArray[(int)c]){
				return true;
			}else{
				boolArray[(int)c] = true;
			}
		}
		return false;
	}
	
	protected static boolean isDuplicateNoSpace(String str){
		
		char[] charArray = str.toCharArray();
	
		for(int i=0;i<charArray.length;i++){
			for(int j=i+1;j<charArray.length;j++){
				if(charArray[i] == charArray[j]){
					return true;
				}
			}
		}
		
		
		return false;
	}

}
