package org.kajjoy.arrays.isomorphicStrings;

import org.kajjoy.arrays.Runner;

import java.util.Scanner;


public class IsomorphicStringRunner implements Runner {
    @Override
    public void run() {
        System.out.println("Please enter string1 : \n");
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        System.out.println("Please enter string2: \n");
        Scanner scn1 = new Scanner(System.in);
        String str2 = scn1.next();
        System.out.println("Result for strings being isometric is: "+ IsomorphicString.check(str1,str2));
    }
}
