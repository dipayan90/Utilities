package org.kajjoy.recursion.lcs;

import org.kajjoy.recursion.Runner;

import java.util.Scanner;

/**
 * Longest common sub-sequence
 * https://www.youtube.com/watch?v=-UGAT-HUuRo
 */

public class LongestCommonSubsequenceRunner implements Runner {

    @Override
    public void run() {
        System.out.println("Welcome to the Longest common subsequence program ");
        System.out.println("Please enter the first string: ");
        Scanner scn1 = new Scanner(System.in);
        String s1 = scn1.next();
        System.out.println("Please enter the second string: ");
        Scanner scn2 = new Scanner(System.in);
        String s2 = scn2.next();
        int length = LongestCommonSubsequence.find(s1,s2);
        System.out.printf("Longest common sub-sequence for Strings %s and %s is:  %d",s1,s2,length);
    }
}
