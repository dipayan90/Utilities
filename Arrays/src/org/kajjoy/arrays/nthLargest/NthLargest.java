package org.kajjoy.arrays.nthLargest;

import java.util.PriorityQueue;

/**
 * Created by chattod on 8/5/16.
 */
public class NthLargest {

	//Easiest Solution 
	   protected static int find(Integer[] numbers,int k){
	    	PriorityQueue<Integer> q = new PriorityQueue<>(k);
	    	for(int num : numbers){
	    		q.offer(num);
	    		if(q.size() > k){
	    			q.poll();
	    		}
	    	}
	    	return q.peek();
    }
}
