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
}
