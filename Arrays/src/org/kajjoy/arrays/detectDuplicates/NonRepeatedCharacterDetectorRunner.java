package org.kajjoy.arrays.detectDuplicates;

import java.util.Scanner;

import org.kajjoy.arrays.Runner;

public class NonRepeatedCharacterDetectorRunner implements Runner {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the String you would like to detect for non repeated character: \n");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println("Please enter the value of n for the nth non repeated character: \n");
		Scanner scn1 = new Scanner(System.in);
		int n = scn.nextInt();
		try {
			System.out.println("The nth non repeated character in: "+ str + " is: "+ NonRepeatedCharacterDetector.getNonRepeatedCharacter(str, n));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
