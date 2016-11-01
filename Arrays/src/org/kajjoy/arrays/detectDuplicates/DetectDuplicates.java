package org.kajjoy.arrays.detectDuplicates;

import java.util.HashSet;

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

	protected static boolean isDuplicateUsingSet(String s){
		HashSet<Character> set = new HashSet<>();
		for(Character c: s.toCharArray()){
			set.add(c);
		}
		if(set.size() == s.length()){
			return false;
		}else{
			return true;
		}
	}

}
