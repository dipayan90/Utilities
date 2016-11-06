package org.kajjoy.recursion;

import org.kajjoy.recursion.factorial.FactorialRunner;
import org.kajjoy.recursion.fibonacci.FibonacciRunner;
import org.kajjoy.recursion.lcs.LongestCommonSubsequenceRunner;

/**
 * Application class for running stuff
 */
public class Application {

    public static void main(String args[]){
        System.out.println("Running recursion based programs");
        getExecutable("LCS").run();
    }

    private static Runner getExecutable(String programName){
        switch(programName){
            case "Fibonnaci" : {
                return new FibonacciRunner();
            }
            case "Factorial" : {
                return new FactorialRunner();
            }
            case "LCS" : {
                return new LongestCommonSubsequenceRunner();
            }
        }
        return () -> System.out.println("Program not available");
    }

}
