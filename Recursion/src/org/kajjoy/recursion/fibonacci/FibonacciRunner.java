package org.kajjoy.recursion.fibonacci;

import org.kajjoy.recursion.Runner;

import java.util.Scanner;

/**
 * Created by dipayan on 11/5/16.
 */
public class FibonacciRunner implements Runner {

    @Override
    public void run() {
        System.out.println("Please enter the number upto which u want to print the fibonacci sequence");
        Scanner scn = new Scanner(System.in);
        int value = scn.nextInt();
        Fibonnaci.printSequence(value);
    }
}
