package org.kajjoy.arrays.stringReverse;

public class StringReverse {
	
	public String iterativereverse(String s){
		int len = s.length();int index = len-1;
		StringBuilder builder = new StringBuilder();
		while(index >= 0){
			builder.append(String.valueOf(s.charAt(index--))) ;
		}
	
		return builder.toString();
	}
	
	public String recursivereverse(String s){
		return reverse(s.toCharArray(),s.length()-1);
	}
	
	public String reverse(char[] array,int len){
		if(len == 0){
			return String.valueOf(array[0]);
		}else{
			return String.valueOf(array[len]).concat(reverse(array,len-1));
		}
	}
	
	public String withoutspacereverse(String s){
		return String.valueOf(reverse(s.toCharArray()));
	}
	
	public char[] reverse(char[] array){
		int i = 0;
		int j = array.length-1;
		while(i<=j){
			swap(array,i++,j--);
		}
		return array;
	}
	
	private void swap(char[] array,int i,int j){
		char temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}

}
