package org.kajjoy.arrays.detectDuplicates;

import java.util.Scanner;

import org.kajjoy.arrays.Runner;

public class DetectDuplicatesRunner implements Runner {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the method you want: \n");
		System.out.println("1: Using space \n");
		System.out.println("2: Without using space \n");
		
		Scanner choiceInput = new Scanner(System.in);
		int choice = choiceInput.nextInt();
		
		
		System.out.println("Please enter the String that you want to detect for duplicates: \n");
		Scanner scn = new Scanner(System.in);
		String inputString = scn.next();
		System.out.println("The result of the detection program is: \n");
		
		if(choice == 1){
			if(DetectDuplicates.isDuplicate(inputString)){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		}else{
			if(DetectDuplicates.isDuplicateNoSpace(inputString)){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		}
		
	}

}