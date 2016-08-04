package org.kajjoy.arrays.stringReverse;

import java.util.Scanner;

import org.kajjoy.arrays.Runner;

public class StringReverseRunner implements Runner {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the string you want to reverse \n" );
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println("Input :"+ s);
		StringReverse obj = new StringReverse();
		System.out.println("Iterative way -> reverse: "+ obj.iterativereverse(s));
		System.out.println("Recurtsive way -> reverse: "+ obj.recursivereverse(s));
		System.out.println("Without Space -> reverse: "+ obj.withoutspacereverse(s));
	}

}
