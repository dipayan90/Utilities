package org.kajjoy.arrays.isomorphicStrings;

public class IsomorphicString {

    protected static boolean check(String str1,String str2){
        int[] tracker = new int[256];
        if(str1.length() != str2.length()){
            return false;
        }else{
            int len = str1.length();
            int index = 0;
            while(index < len){
                if(tracker[str1.charAt(index)] == 0){
                    tracker[(int)str1.charAt(index)] = (int) str2.charAt(index);
                }else{
                    if(tracker[(int)str1.charAt(index)] != (int) str2.charAt(index)){
                        return false;
                    }
                }
                index ++;
            }
        }
        return true;
    }
}
