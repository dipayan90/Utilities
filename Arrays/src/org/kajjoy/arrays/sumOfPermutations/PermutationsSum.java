package org.kajjoy.arrays.sumOfPermutations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationsSum {

    public static Integer sum(Integer num){
        if(num == null){
            return 0;
        }
        
        List<Integer> digits = getDigits(num);
        List<Integer> digitsCopy = new ArrayList<>(digits);
        int digiLength = digits.size();
        
        List<Integer> allPermutations = new ArrayList<>();
        
       for(int i=0;i<digiLength;i++){
    	   int j =0;
    	   while(j < digiLength){
    		   digitsCopy.set(i, digits.get(j));
    		   allPermutations.add(getNum(digitsCopy,digiLength-1,0));
    		   j++;
    	   }
       }
       
       printPermutations(allPermutations);
       System.out.println("Sum of all permutations is: ");
        return getSum(allPermutations);
    }

    public static void printDigits(Integer num){
        System.out.println("Input number is: "+ num);
        System.out.println("Digits on your number are: ");
        getDigits(num).stream().forEach(e -> System.out.println("[ " + e+ " ]"));
    }
    
    private static void printPermutations(List<Integer> perms){
    	System.out.println("All possible permutations for exisitng number are: ");
    	perms.stream().forEach(e -> System.out.println("[ "+ e + " ]"));
    }
    
    private static Integer getSum(List<Integer> list){
    	return list.stream().reduce((x,y) -> x+y).get();
    }

    // char - '0' wil help converting asci to numeric value 
    private static List<Integer> getDigits(Integer num){
        String numString = Integer.toString(num);
       return numString.chars()
                .mapToObj(e -> Integer.valueOf(String.valueOf( e - '0')))
                .collect(Collectors.toList());
    }
    
    public static int getNum(List<Integer> numlist,int end,int start){
    	if(start >= numlist.size()-1){
    		return numlist.get(start);
    	}
    	return (int) ((numlist.get(start) * Math.pow(10, end)) + getNum(numlist,end-1,start+1));
    }

}
