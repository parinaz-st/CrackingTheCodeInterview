package com.cracking.questions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class generateCompressedStringTest {
    StringCompression stringCompression = new StringCompression();
    @Test
    public void given_book_Example_generateCompressedString(){
        stringCompression.generateCompressedString("aabcccccaaa");
    }
}


