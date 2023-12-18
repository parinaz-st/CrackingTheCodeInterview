package com.cracking.questions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PalindromePermutationTest {
    PalindromePermutation palindromePermutation = new PalindromePermutation();
    @Test
    public void isPalindrome(){
        assertTrue(palindromePermutation.isPalindromePermutation("pariirp"));
        assertFalse(palindromePermutation.isPalindromePermutation("pariirpn"));
    }
    @Test
    public void isPalindrome_sameCharacters(){
        assertTrue(palindromePermutation.isPalindromePermutation("AA"));
        assertTrue(palindromePermutation.isPalindromePermutation("AAA"));
        assertFalse(palindromePermutation.isPalindromePermutation("AAA1"));
    }
}
