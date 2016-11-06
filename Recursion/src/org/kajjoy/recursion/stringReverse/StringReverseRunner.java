package org.kajjoy.recursion.stringReverse;

import org.kajjoy.recursion.Runner;

import java.util.Scanner;

public class StringReverseRunner implements Runner {
    @Override
    public void run() {
        System.out.println("Please enter the string to reverse: ");
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String result =  StringReverse.reverse(str);
        System.out.printf("Reverse for string %s is : %s",str,result);
    }
}
