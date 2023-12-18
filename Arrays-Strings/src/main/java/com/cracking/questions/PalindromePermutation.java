package com.cracking.questions;

import com.cracking.questions.utility.StringsCommon;

public class PalindromePermutation {

    boolean foundOdd = false;
    //Case insensitive
    public boolean isPalindromePermutation(String str){
        try {

            //Compute how many times each character appeared
            int arraySize =(StringsCommon.getCharacterNumber('Z') - StringsCommon.getCharacterNumber('a') + 1);
            int [] countArray = new int[arraySize];
            char [] strArray = str.toCharArray();
            // o(n)
            for(char c : strArray){
                countArray[StringsCommon.getCharacterNumber(c)] ++;
            }
            for(int count : countArray){
                if(count % 2 == 1){
                    if(foundOdd) {
                        return false;
                    }
                    foundOdd = true;
                }
            }
            return true;
        }catch (Exception ex){
            System.out.println(ex.getStackTrace());
            return false;
        }
    }
}
