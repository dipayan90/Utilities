package org.kajjoy.arrays.anagramChecker;

public class AnagramChecker {
	
	protected static boolean check(String str1,String str2){
		if(str1 == null || str2 == null){
			return false;
		}
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1 != len2){
			return false;
		}
		
		int[] charMap = new int[256];		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		for(char c : charArray1){
			charMap[(int)c]++;
		}
		
		for(char c: charArray2){
			if(charMap[(int)c] != 0){
				charMap[(int)c] --;
			}
		}
		
		for(int i=0;i<charMap.length;i++){
			if(charMap[i] != 0){
				return false;
			}
		}
		
		return true;
	}

}
