package org.kajjoy.sorts.merge;

import java.util.Scanner;

import org.kajjoy.sorts.Runner;

public class MergeSortRunner implements Runner {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the array you want to sort \n");
		System.out.println("Please enter series of numbers separated by commas \n");
		Scanner scn = new Scanner(System.in);
		String numbers = scn.next();
		display(MergeSort.sort(convertStringToArray(numbers)));
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
