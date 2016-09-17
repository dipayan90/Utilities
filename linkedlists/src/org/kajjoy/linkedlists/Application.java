package org.kajjoy.linkedlists;

import org.kajjoy.linkedlists.cycleDetector.CycleDetectorRunner;
import org.kajjoy.linkedlists.queues.QueueRunner;
import org.kajjoy.linkedlists.reorder.ReorderRunner;
import org.kajjoy.linkedlists.stacks.StackRunner;
import org.kajjoy.linkedlists.sum.SumRunner;

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

        runModules("cyclicDetector").run();
    }


    private static Runner runModules(String module){
        switch(module){
            case "stack":{
                System.out.println("Running the program to do stack operations");
                return new StackRunner();
            }
            case "queue":{
                System.out.println("Running the program to do queue operations");
                return new QueueRunner();
            }
            case "sum":{
                System.out.println("Running the program to sum 2 linked lists");
                return new SumRunner();
            }
            case "reorder":{
                System.out.println("Running the program to reorder linked lists");
                return new ReorderRunner();
            }
            case "cyclicDetector":{
                System.out.println("Running the program to detect if a linkedlist is cyclic");
                return new CycleDetectorRunner();
            }
        }
        return () -> System.out.println("Please Specify a runner to run program");
    }
}
