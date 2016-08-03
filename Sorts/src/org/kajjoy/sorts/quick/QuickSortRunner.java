package org.kajjoy.sorts.quick;

import java.util.Scanner;

import org.kajjoy.sorts.Runner;

public class QuickSortRunner implements Runner{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the array \n");
		System.out.println("Please enter series of numbers separated by commas \n");
		Scanner scn = new Scanner(System.in);
		String numbers = scn.next();
		Integer[] req = convertStringToArray(numbers);
		QuickSort quickSort = new QuickSort();
		quickSort.setArray(req);
		display(quickSort.sort());
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
