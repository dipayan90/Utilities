package org.kajjoy.arrays;

import org.kajjoy.arrays.anagramChecker.AnagramCheckerRunner;
import org.kajjoy.arrays.bitCount.BitCountRunner;
import org.kajjoy.arrays.detectDuplicates.DetectDuplicatesRunner;
import org.kajjoy.arrays.detectDuplicates.NonRepeatedCharacterDetectorRunner;
import org.kajjoy.arrays.removeDuplicates.RemoveDuplicatesRunner;
import org.kajjoy.arrays.sumchecker.SumCheckerRunner;

public class Application {

	public static void main(String[] args){
		System.out.println("Welcome to the Arrays Application: \n");
		System.out.println("Your args are: ");
		for(String arg: args){
			System.out.println(arg + "\t");
		}
		
		runModules("bitCount").run();
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
			case "nonRepeatedChars":{
				System.out.println("Running the program to return the nth non repeated character in a String \n");
				return new NonRepeatedCharacterDetectorRunner();
			}
			case "sumchecker":{
				System.out.println("Running program to detect first consecutive set of numbers that add up to a given target number \n");
				return new SumCheckerRunner();
			}
			case "bitCount":{
				System.out.println("Running program to find maximum count of set bits in an integer with just one swap \n");
				return new BitCountRunner();
			}
		}
		return () -> System.out.println("Please Specify a runner to run program");
	}
	
}
