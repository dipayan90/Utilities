package org.kajjoy.arrays.removeDuplicates;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	protected static String remove(String str){
		char[] charArray = str.toCharArray();
		boolean[] tracker = new boolean[256];
		StringBuilder builder = new StringBuilder(str.length());
		for(char c: charArray){
			if(!tracker[(int)c]){
				builder.append(c);
			}
			tracker[(int)c]=true;
		}
		return builder.toString();
	}
	
	protected static String removeWithoutSpace(String str){
		
		char[] charArray = str.toCharArray();
		int len = charArray.length;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(charArray[i]==charArray[j]){
					int temp = j;
					for(int index = j+1;index<len;index++){
						charArray[temp] = charArray[index];
						temp++;
					}
					j--;
					len --;
				}
			}
		}
		return new String(charArray);
	}
	
	protected static String removeUsingSets(String str){
		Set<Character> uniqueSet = new LinkedHashSet<>();
		for(char c : str.toCharArray()){
			uniqueSet.add(c);
		}
		StringBuilder builder = new StringBuilder();
		for(char c: uniqueSet){
			builder.append(c);
		}
		return builder.toString();
	}
}
