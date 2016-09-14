package org.kajjoy.linkedlists;

/**
 * Created by dipayan on 9/14/16.
 */
public class Application {
    public static void main(String[] args){
        System.out.println("Welcome to the LinkedList Application: \n");
        System.out.println("Your args are: ");
        for(String arg: args){
            System.out.println(arg + "\t");
        }

        runModules("minimumSubArraySum").run();
    }


    private static Runner runModules(String module){
        switch(module){
            case "detectDuplicates":{
                System.out.println("Running the program to detect duplicates");
              //  return new DetectDuplicatesRunner();
            }


        }
        return () -> System.out.println("Please Specify a runner to run program");
    }
}
