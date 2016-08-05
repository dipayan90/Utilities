package org.kajjoy.trees;

public class Application {
	
	public static void main(String args[]){
		System.out.println("Welcome to the trees module");
		String s = "dipayan";
		System.out.println(reverse(s.toCharArray(),s.length()-1));
	}
	
	public static String reverse(char[] array,int len){
		if(len == 0){
			return String.valueOf(array[0]);
		}else{
			return String.valueOf(array[len]).concat(reverse(array,len-1));
		}
	}

	

}
