package org.kajjoy.linkedlists;

import org.kajjoy.linkedlists.queues.QueueRunner;
import org.kajjoy.linkedlists.stacks.StackRunner;

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

        runModules("queue").run();
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

        }
        return () -> System.out.println("Please Specify a runner to run program");
    }
}
