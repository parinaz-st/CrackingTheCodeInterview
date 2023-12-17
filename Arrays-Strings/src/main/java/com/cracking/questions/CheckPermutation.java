package com.cracking.questions;

import com.cracking.questions.utility.StringsCommon;

import java.util.Arrays;

public class CheckPermutation {
    // o (n log n)
    public boolean checkPermutation_logarithmic(String str1, String str2){
        String rmStr1 = StringsCommon.removeSpacesStr(str1);
        String rmStr2 = StringsCommon.removeSpacesStr(str2);
        if(rmStr1.length() != rmStr2.length())
            return false;
       String lowStr1 = rmStr1.toLowerCase();
        String lowStr2 = rmStr2.toLowerCase();
        String sortedStr1 = StringsCommon.stringQuickSort(lowStr1);
        String sortedStr2 = StringsCommon.stringQuickSort(lowStr2);
        if (!sortedStr1.equals(sortedStr2))
            return false;
        return true;
    }
    public boolean checkPermutation_linear(String str1, String str2){
    // assumption: ASCII
        String rmStr1 = StringsCommon.removeSpacesStr(str1);
        String rmStr2 = StringsCommon.removeSpacesStr(str2);
        if(rmStr1.length() != rmStr2.length())
            return false;
        String lowStr1 = rmStr1.toLowerCase();
        String lowStr2 = rmStr2.toLowerCase();

        int [] chars = new int[128];
        char [] str1Array = lowStr1.toCharArray();
        for( char c : str1Array){
            chars[c]++;
        }
        for(int i = 0; i<lowStr2.length(); i++){
            int c = (int) lowStr2.charAt(i);
            chars[c] --;
            if(chars[c] < 0)
                return false;
        }
        return true;
    }


}
