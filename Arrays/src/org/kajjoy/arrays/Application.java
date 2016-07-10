package org.kajjoy.arrays;

import org.kajjoy.arrays.anagramChecker.AnagramCheckerRunner;
import org.kajjoy.arrays.detectDuplicates.DetectDuplicatesRunner;
import org.kajjoy.arrays.removeDuplicates.RemoveDuplicatesRunner;

public class Application {

	public static void main(String[] args){
		System.out.println("Welcome to the Arrays Application: \n");
		System.out.println("Your args are: ");
		for(String arg: args){
			System.out.println(arg + "\t");
		}
		runModules("checkAnagrams").run();
	}
	
	
	private static Runner runModules(String module){
		switch(module){
			case "detectDuplicates":{
				System.out.println("Running the program to detect duplicates");
				return new DetectDuplicatesRunner();
			}
			case "removeDuplicates":{
				System.out.println("Running the program to remove duplicates");
				return new RemoveDuplicatesRunner();
			}
			case "checkAnagrams":{
				System.out.println("Running the program to detect anagrams");
				return new AnagramCheckerRunner();
			}
		}
		return () -> System.out.println("Please Specify a runner to run program");
	}
	
}
