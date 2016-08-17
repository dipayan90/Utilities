package org.kajjoy.arrays.mergeIntervals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.kajjoy.arrays.Runner;

public class MergeIntervalsRunner implements Runner {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the merge interval runner project \n");
		System.out.println("Enter the intervals, in the following format: ");
		System.out.println("4,8|11,15|9,12|2,6");
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		List<Integer[]> intervals = parse(input);
		System.out.println("Input: ");
		print(intervals);
		System.out.println("Output: ");
		print(MergeIntervals.mergeIntervals(intervals));
	}
	
	private List<Integer[]> parse(String s){
		String[] intervals = s.split("\\|");
		List<Integer[]> res = new ArrayList<>();
		for(String interval: intervals){
			String[] range = interval.split(",");
			if(range.length == 0 || range.length == 1){
				throw new IllegalArgumentException("Range not proper");
			}
			Integer[] intRange = new Integer[2];
			intRange[0] = Integer.valueOf(range[0]);
			intRange[1] = Integer.valueOf(range[1]);
			res.add(intRange);
		}
		return res;
	}
	
	private void print(List<Integer[]> intervals){
		intervals.stream().forEach(arr -> printArray(arr));
	}
	
	private void printArray(Integer[] array){
		System.out.println("[ "+array[0]+" , "+array[1]+" ]");
	}

}
