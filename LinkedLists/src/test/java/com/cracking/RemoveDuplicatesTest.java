package com.cracking;

import com.cracking.questions.RemoveDuplicates;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.LinkedList;

@SpringBootTest
public class RemoveDuplicatesTest {
    RemoveDuplicates removeDuplicates = new RemoveDuplicates();
    @Test
    public void contextLoad(){

    }
    @Test
    public void given_a_list_return_remove_duplicates(){
        LinkedList<String> list = new LinkedList<>();
        list.add("parinaz");
        list.add("parisa");
        list.add("behnam");
        list.add("behnam");
        list.add("parinaz");
        LinkedList<String> newList = removeDuplicates.removeDuplicates(list);
        for(String str : newList){
            System.out.println(str);
        }

    }
}
