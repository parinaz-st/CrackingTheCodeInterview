package com.cracking.questions;

import com.cracking.questions.utility.StringsCommon;

public class StringCompression {

    public String generateCompressedString(String str){
        String compressedStr = "";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count ++;
             if( i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressedStr += "" + str.charAt(i) + count;
                count = 0;
            }
        }
        return compressedStr;
    }
}

