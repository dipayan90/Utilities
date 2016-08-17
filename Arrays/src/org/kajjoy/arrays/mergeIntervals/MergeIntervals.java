package org.kajjoy.arrays.mergeIntervals;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static List<Integer[]> mergeIntervals(List<Integer[]> intervals){
		Collections.sort(intervals,new ArrayComparator());
		int index = 0;
		int nextIndex = index + 1;
		while(true){
			if(nextIndex >= intervals.size()){
				break;
			}
			if(merge(intervals.get(index),intervals.get(nextIndex)) != null){
				Integer[] res = merge(intervals.get(index),intervals.get(nextIndex));
				intervals.set(nextIndex, res);
				intervals.remove(index);
			}
			index++;
			nextIndex++;
		}
		return intervals;
	}
	
	private static Integer[] merge(Integer[] a,Integer[] b){
		if(a == null || b == null){
			return null;
		}
		if(b[0] < a[1]){
			if(b[1] < a[1]){
				return a;
			}
			return new Integer[]{ a[0], b[1] };
		}else{
			System.out.println("Arrays cannot be merged");
			return null;
		}
	}
	

}

class ArrayComparator implements Comparator<Integer[]>{

	@Override
	public int compare(Integer[] arg0, Integer[] arg1) {
		// TODO Auto-generated method stub
		if(arg0[0] < arg1[0]){
			return -1;
		}else{
			return 1;
		}
	}
	
}
