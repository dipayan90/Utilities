package org.kajjoy.sorts;

import org.kajjoy.sorts.bubble.BubbleSortRunner;
import org.kajjoy.sorts.merge.MergeArrayRunner;
import org.kajjoy.sorts.merge.MergeSortRunner;
import org.kajjoy.sorts.quick.PivotGrouperRunner;
import org.kajjoy.sorts.quick.QuickSortRunner;

public class Application {

	public static void main(String args[]) {
		System.out.println("Welcome to the Sorts Module !! \n");
		System.out.println("You are running: \n");
		getRunner("quickSort").run();
	}

	private static Runner getRunner(String runnerType) {
		switch (runnerType) {
		case "bubbleSort": {
			System.out.println("The program to sort integers using bubbleSort");
			return new BubbleSortRunner();
		}
		case "mergeSort": {
			System.out.println("The program to sort integers using merge sort \n");
			return new MergeSortRunner();
		}
		case "mergeArray": {
			System.out.println("The program to sort and merge two arrays \n");
			return new MergeArrayRunner();
		}
		case "pivotGrouper": {
			System.out.println("The program to group array such that elements on left are smaller than pivot and ones on right are greater \n");
			return new PivotGrouperRunner();
		}
		case "quickSort": {
			System.out.println("The program to sort elements using quick sort \n");
			return new QuickSortRunner();
		}
		}

		return () -> System.out.println("Please enter the type of sort you want to run");

	}

}
