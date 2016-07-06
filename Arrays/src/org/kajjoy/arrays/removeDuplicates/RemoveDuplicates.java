package org.kajjoy.arrays.removeDuplicates;

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

}
