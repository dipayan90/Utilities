package org.kajjoy.recursion;

import org.kajjoy.recursion.factorial.FactorialRunner;
import org.kajjoy.recursion.fibonacci.FibonacciRunner;
import org.kajjoy.recursion.lcs.LongestCommonSubsequenceRunner;
import org.kajjoy.recursion.stringReverse.StringReverseRunner;

/**
 * Application class for running stuff
 */
public class Application {

    public static void main(String args[]){
        System.out.println("Running recursion based programs");
        getExecutable("StringReverse").run();
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
            case "StringReverse" : {
                return new StringReverseRunner();
            }
        }
        return () -> System.out.println("Program not available");
    }

}
