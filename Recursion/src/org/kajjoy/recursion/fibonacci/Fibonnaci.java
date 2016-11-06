package org.kajjoy.recursion.fibonacci;

/**
 * Created by dipayan on 11/5/16.
 */
public class Fibonnaci {

    public static void printSequence(int n){
        int k = fibonnaci(n);
        System.out.println("Fibonacci series is: "+ k);
    }

    private static int fibonnaci(int n){
        if(n < 3){
            return 1;
        }else{
            return fibonnaci(n-2) + fibonnaci(n-1);
        }
    }

}
