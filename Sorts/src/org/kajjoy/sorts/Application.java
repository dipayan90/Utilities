package org.kajjoy.sorts;

import org.kajjoy.sorts.bubble.BubbleSortRunner;

public class Application {

	public static void main(String args[]) {
		System.out.println("Welcome to the Sorts Module !! \n");
		System.out.println("You are running: \n");
		getRunner("bubbleSort").run();
	}

	private static Runner getRunner(String runnerType) {
		switch (runnerType) {
		case "bubbleSort": {
			System.out.println("The program to sort integers using bubbleSort");
			return new BubbleSortRunner();
		}
		}

		return () -> System.out.println("Please enter the type of sort you want to run");

	}

}
