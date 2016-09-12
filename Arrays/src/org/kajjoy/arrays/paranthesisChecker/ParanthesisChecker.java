package org.kajjoy.arrays.paranthesisChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by dipayan on 9/10/16.
 */
public class ParanthesisChecker {

    //example input [{()}] or [{){]

    public static boolean check(char[] charArray){
        Stack<Character> validator = new Stack<>();
        for(char c: charArray){
            if(getMap().containsKey((int)c)){
                if( ((int) validator.peek() != getMap().get((int)c)) ){
                    return false;
                }else{
                    validator.pop();
                }
            }else{
                validator.push(c);
            }
        }

        return validator.empty();
    }

    private static Map<Integer,Integer> getMap(){
        Map<Integer,Integer> mapper = new HashMap<>();
        mapper.put((int)'}',(int)'{');
        mapper.put((int)')',(int)'(');
        mapper.put((int)']',(int)'[');
        return mapper;
    }
}
