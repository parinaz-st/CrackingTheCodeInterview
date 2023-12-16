package com.cracking.questions;

import java.util.Arrays;

public class IsUnique {
    // assumption: ASCII string
    // time and space complexity ~ 0(n^2)
    public boolean isUnique_mine(String str){

        if(str.length() > 128)
            return false;
        for(int i = 0; i < str.length(); i++){
            if(str.substring(i+1).contains(String.valueOf(str.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    // assumption: ASCII string
    //o(n) time complexity- o(1) space complexity
    public boolean isUnique_Gayle(String str){

        if(str.length() > 128)
            return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i< str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val])
                return false;
            char_set[val] =true;
        }
        return true;
    }
    // assumption: ASCII string
    //o(n log(n)) time complexity
    // sort the character first
    public boolean isUnique_with_Sort(String str){
        char [] chars = str.toCharArray();
        //quick sort o(nlog(n))
        Arrays.sort(chars);
        String sortedStr = new String(chars);

        for(int i = 0; i< sortedStr.length()-1; i++)
        {
            if(sortedStr.charAt(i) == sortedStr.charAt(i+1))
                return false;
        }
        return true;
    }
}
