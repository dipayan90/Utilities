package org.kajjoy.recursion.lcs;

/**
 * Created by dipayan on 11/5/16.
 */
public class LongestCommonSubsequence {

    public static int find(String s1,String s2){
        return lcs(s1,s2,0,0);
    }

    public static int lcs(String s1,String s2,int len1,int len2){
        if(len1 == s1.length()){
            return 0;
        }
        if(len2 == s2.length()){
            return 0;
        }
        int option1 = lcs(s1,s2,len1+1,len2);
        int option2 = lcs(s1,s2,len1,len2+1);
        int option3 = lcs(s1,s2,len1+1,len2+1);
        if(s1.charAt(len1) == s2.charAt(len2)){
            option3 +=1;
        }
        return Math.max(option1,Math.max(option2,option3));
    }

}
