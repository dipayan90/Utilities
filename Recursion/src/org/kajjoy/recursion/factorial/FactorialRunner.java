package org.kajjoy.recursion.factorial;


import org.kajjoy.recursion.Runner;

import java.util.Scanner;

public class FactorialRunner implements Runner {
    @Override
    public void run() {
        System.out.println("Please enter the number for which you want factorial");
        Scanner scn = new Scanner(System.in);
        int value = scn.nextInt();
        int result = Factoral.factorial(value);
        System.out.printf("Factorial for %d is : %d",value,result);
    }
}
