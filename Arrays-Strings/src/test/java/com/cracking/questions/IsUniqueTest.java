package com.cracking.questions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class IsUniqueTest {
    @Test
    public void contextLoad(){}

    @Test
    public void givenString_then_return_notUnique_mine()
    {
        IsUnique isUnique = new IsUnique();
        assertFalse(isUnique.isUnique_mine("parinaz"));
    }
    @Test
    public void givenString_then_return_isUnique_mine()
    {
        IsUnique isUnique = new IsUnique();
        assertTrue(isUnique.isUnique_mine("behnam"));
    }
    @Test
    public void givenString_then_return_notUnique_gayle()
    {
        IsUnique isUnique = new IsUnique();
        assertFalse(isUnique.isUnique_Gayle("parinaz"));
    }
    //o(n) time complexity- o(1) space complexity
    @Test
    public void givenString_then_return_isUnique_gayle()
    {
        IsUnique isUnique = new IsUnique();
        assertTrue(isUnique.isUnique_Gayle("behnam"));
    }
    @Test
    public void givenString_then_return_notUnique_sorted()
    {
        IsUnique isUnique = new IsUnique();
        assertFalse(isUnique.isUnique_with_Sort("parinaz"));
    }
    @Test
    public void givenString_then_return_isUnique_sorted()
    {
        IsUnique isUnique = new IsUnique();
        assertTrue(isUnique.isUnique_with_Sort("behnam"));
    }

}
