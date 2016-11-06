package org.kajjoy.recursion.stringReverse;

/**
 * Created by dipayan on 11/5/16.
 */
public class StringReverse {

    public static String reverse(String s){
        return reverse(s,s.length()-1);
    }

    public static String reverse(String s,int len){
        if(len == 0){
            return String.valueOf(s.charAt(0));
        }
        return s.charAt(len) + reverse(s,len-1);
    }
}
