package org.kajjoy.arrays.anagramChecker;

import java.util.Scanner;

import org.kajjoy.arrays.Runner;

public class AnagramCheckerRunner implements Runner {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the 2 strings for which you want to check for anagrams \n");
		System.out.println("Enter String 1: \n");
		Scanner scn1 = new Scanner(System.in);
		String str1 = scn1.next();
		System.out.println("Enter String 2: \n");
		Scanner scn2 = new Scanner(System.in);
		String str2 = scn2.next();
		System.out.println("processing .... \n");
		boolean result =  AnagramChecker.check(str1, str2);
		if(result){
			System.out.println("The two strings are anagrams \n");
		}else{
			System.out.println("The two strings are not anagrams \n");
		}
	}

}
