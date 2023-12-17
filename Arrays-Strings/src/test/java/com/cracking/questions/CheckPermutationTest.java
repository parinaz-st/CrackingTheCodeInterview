package com.cracking.questions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CheckPermutationTest {
    CheckPermutation checkPermutation = new CheckPermutation();
    @Test
    public void given_2PermutatedStrings_returnTrue_log(){
        assertTrue(checkPermutation.checkPermutation_logarithmic("Bab", "abb"));
        assertTrue(checkPermutation.checkPermutation_logarithmic(" Bab", "Abb"));
        assertTrue(checkPermutation.checkPermutation_logarithmic(" Bab", "bAb "));
        assertTrue(checkPermutation.checkPermutation_logarithmic(" 12 1", "1 12 "));
        assertFalse(checkPermutation.checkPermutation_logarithmic("baBa", "bab"));
    }
    @Test
    public void given_2PermutatedStrings_returnTrue_linear(){
        assertTrue(checkPermutation.checkPermutation_linear("Bab", "abb"));
        assertTrue(checkPermutation.checkPermutation_linear(" Bab", "Abb"));
        assertTrue(checkPermutation.checkPermutation_linear(" Bab", "bAb "));
        assertTrue(checkPermutation.checkPermutation_linear(" 12 1", "1 12 "));
        assertFalse(checkPermutation.checkPermutation_linear("baBa", "bab"));
    }
}
