package org.kajjoy.arrays.bitCount;

import java.util.Scanner;

import org.kajjoy.arrays.Runner;

public class BitCountRunner implements Runner{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number for which you want to get bit counts for \n");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		BitCount.getCountofHighestNumberOfSetBits(n);
	}

}
