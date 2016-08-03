package org.kajjoy.sorts.merge;

import java.util.Scanner;

import org.kajjoy.sorts.Runner;

public class MergeArrayRunner implements Runner {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the array1 \n");
		System.out.println("Please enter series of numbers separated by commas \n");
		Scanner scn1 = new Scanner(System.in);
		String numbers1 = scn1.next();
		Integer[] req1 = convertStringToArray(numbers1);
		
		System.out.println("Please enter the array2 \n");
		System.out.println("Please enter series of numbers separated by commas \n");
		Scanner scn2 = new Scanner(System.in);
		String numbers2 = scn2.next();
		Integer[] req2 = convertStringToArray(numbers2);
		display(MergeArray.merge(req1,req2));
	}
	
	private Integer[] convertStringToArray(String s){
		String[] splits = s.split(",");
		Integer[] res = new Integer[splits.length];
		int index = 0;
		for(String seg: splits){
			res[index++] = Integer.parseInt(seg);
		}
		return res;
	}
	
	private void display(Integer[] array){
		System.out.println("[ ");
		for(int i: array){
			System.out.println(i);
			System.out.println(",");
		}
		System.out.println(" ]");
		
	}

}
