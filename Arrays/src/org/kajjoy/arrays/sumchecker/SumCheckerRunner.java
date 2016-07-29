package org.kajjoy.arrays.sumchecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import org.kajjoy.arrays.Runner;

public class SumCheckerRunner implements Runner{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the integer array \n");
		Scanner scn = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		while(scn.hasNextBigInteger()){
			list.add(scn.nextInt());
		}
		int[] array = new int[list.size()];
		AtomicInteger index = new AtomicInteger(0);
		System.out.println("The Array you entered is : \n");
		System.out.println("[ ");
		list.forEach(a -> {
			array[index.get()] = a;
			System.out.println(array[index.get()] + ", ");
			index.getAndIncrement();
			});
		System.out.println(" ]\n");
		
		System.out.println("Please enter the target sum value: \n");
		Scanner scn1 = new Scanner(System.in);
		int target = scn1.nextInt();
		List<Integer> result = SumChecker.getNumbers(array, target);
		System.out.println("The result is: \n");
		result.forEach(a -> System.out.println(a));
		
	}

}
