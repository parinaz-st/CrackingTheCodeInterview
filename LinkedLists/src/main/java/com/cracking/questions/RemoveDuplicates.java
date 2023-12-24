package com.cracking.questions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveDuplicates {

    //The easy Solution
    public LinkedList<String> removeDuplicates(LinkedList<String> myList){
        HashSet<String> set = new HashSet<>(); // for unique items
        LinkedList<String> result = new LinkedList<>();

        for (String element : myList) {
            if (set.add(element)) {
                result.add(element);
            }
        }

        myList.clear();
        myList.addAll(result);
        return myList;
    }
}
