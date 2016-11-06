package org.kajjoy.recursion.factorial;

/**
 * Created by dipayan on 11/5/16.
 */
public class Factoral {

    public static int factorial(int n){
        if (n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
