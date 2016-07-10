package org.kajjoy.arrays.removeDuplicates;

import java.util.Scanner;

import org.kajjoy.arrays.Runner;

public class RemoveDuplicatesRunner implements Runner {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Please enter option: \n");
		System.out.println("1: with space \t 2: without space");
		Scanner choiceInput = new Scanner(System.in);
		int choice = choiceInput.nextInt();
		
		System.out.println("Please enter the string from which you want to remove duplicates from: \n");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		System.out.println("String without duplicates is: \n");
		
		if(choice == 1){
			System.out.println( RemoveDuplicates.remove(str));
		}else if(choice == 2){
			System.out.println(RemoveDuplicates.removeWithoutSpace(str));
		}
	}

}
