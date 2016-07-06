package org.kajjoy.arrays;

import org.kajjoy.arrays.detectDuplicates.DetectDuplicatesRunner;
import org.kajjoy.arrays.removeDuplicates.RemoveDuplicatesRunner;

public class Application {

	public static void main(String[] args){
		System.out.println("Welcome to the Arrays Application: \n");
		System.out.println("Your args are: ");
		for(String arg: args){
			System.out.println(arg + "\t");
		}
		runModules("removeDuplicates").run();
	}
	
	
	private static Runner runModules(String module){
		switch(module){
			case "detectDuplicates":{
				return new DetectDuplicatesRunner();
			}
			case "removeDuplicates":{
				return new RemoveDuplicatesRunner();
			}
		}
		return () -> System.out.println("Please Specify a runner to run program");
	}
	
}
