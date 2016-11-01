package org.kajjoy.arrays.isomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    protected static boolean check(String str1,String str2){

        if(str1.length() != str2.length()){
            return false;
        }
        Map<Character,Character> charMap = new HashMap<>();
        int index = 0;
        for(Character c : str1.toCharArray()){
            Character actual = str2.charAt(index);
            if(charMap.containsKey(c)){
                Character expected = charMap.get(c);
                if(expected != actual){
                    return false;
                }
            } else if(charMap.containsValue(actual)){
                Character exp = charMap.entrySet().stream()
                        .filter(e -> e.getValue().equals(actual))
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null);
                if(exp != c) {
                    return false;
                }
            }else{
                charMap.put(c,str2.charAt(index));
            }
            index++;
        }
        return true;
    }
}
