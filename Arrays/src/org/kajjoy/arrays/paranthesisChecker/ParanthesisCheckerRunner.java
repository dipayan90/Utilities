package org.kajjoy.arrays.paranthesisChecker;

import org.kajjoy.arrays.Runner;

import java.util.Scanner;


public class ParanthesisCheckerRunner implements Runner {

    @Override
    public void run() {

        System.out.println("Enter the equation: ");
        Scanner scn = new Scanner(System.in);
        String equation = scn.next();
        System.out.println("The entered equation is: "+ equation);
        boolean result =  ParanthesisChecker.check(equation.toCharArray());
        if(result){
            System.out.println("The equation entered PASSES the paranthesis test");
        }else{
            System.out.println("The equation entered FAILS paranthesis test");
        }

    }
}
