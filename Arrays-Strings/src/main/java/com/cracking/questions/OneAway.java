package com.cracking.questions;

import com.cracking.questions.utility.StringsCommon;

public class OneAway {


    public boolean oneAway(String str1, String str2){
        // remove spaces and make them all lowercase
        String rmStr1 = StringsCommon.removeSpacesStr(str1);
        String rmStr2 = StringsCommon.removeSpacesStr(str2);

        String lwRmStr1 = rmStr1.toLowerCase();
        String lwRmStr2 = rmStr2.toLowerCase();

        // if lengths are the same-> replace char
        if(lwRmStr1.length() == lwRmStr2.length()){
            // all characters beside just one should be the same
            return oneEditReplace(lwRmStr1, lwRmStr2);
        }
        //if lengths are 1 away -> remove or insert chars
        else if(lwRmStr1.length() + 1 == lwRmStr2.length()){
            oneEditReplace(lwRmStr1,lwRmStr2);
        }
        else if (lwRmStr1.length() - 1 == lwRmStr2.length()){
            oneEditReplace(lwRmStr2,lwRmStr1);
        }
        return true;
    }

    public boolean oneEditReplace(String str1, String str2){
        boolean foundDifferenceAlready = false;
        for(int i = 0; i< str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                if(foundDifferenceAlready){
                    return false;
                }
                foundDifferenceAlready = true;
            }
        }
        return true;
    }
    public boolean oneEditInsert(String str1, String str2){
        int index1 = 0;
        int index2 = 0;
        while(index1 < str1.length() && index2 < str2.length()){
            if(str1.charAt(index1) != str2.charAt(index2))
            {
                if(index1 != index2){
                    return false;
                }
                index1 ++;
            }
            else{
                index1 ++;
                index2 ++;
            }
        }
        return true;
    }
}
