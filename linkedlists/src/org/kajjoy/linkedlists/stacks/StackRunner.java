package org.kajjoy.linkedlists.stacks;

import org.kajjoy.linkedlists.Runner;

import java.util.Scanner;

public class StackRunner implements Runner {

    @Override
    public void run() {

        for(int i=0;i<5;i++){
            System.out.println("Please enter an element you wanna enter into a stack: ");
            Scanner scn = new Scanner(System.in);
            int val = scn.nextInt();
            Stack.push(val);
        }

        System.out.println("Element on the top of the stack is: " + Stack.peek().getData());

        System.out.println("Lets delete the top element off the stack, the element we are deleting is: "+ Stack.pop().getData());

        System.out.println("The new element on top of the stack is: " + Stack.peek().getData());

    }
}
