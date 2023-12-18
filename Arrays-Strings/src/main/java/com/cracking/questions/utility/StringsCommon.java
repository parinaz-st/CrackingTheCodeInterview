package com.cracking.questions.utility;

import java.util.Arrays;

public class StringsCommon {

    public static String removeSpacesStr(String str){
        return str.replace(" ", "");
    }
    public static String stringQuickSort(String str){
        char [] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        return sortedString;
    }
    // this is not working for non-alphabetical chars
    // a->0, b->1, ....
    public static int getCharacterNumber(char c){
        int a = Character.getNumericValue('a');
        int Z = Character.getNumericValue('Z');
        int val = Character.getNumericValue(c);
        if(val < a || val > Z)
            return -1;
        return val - a;
    }
}
