package com.cracking.questions;

public class StringRotation {
    public boolean isRotation(String s1, String s2){
        String  x = s1.concat(s1);
        if(!x.contains(s2))
            return false;
        return true;
    }
}
