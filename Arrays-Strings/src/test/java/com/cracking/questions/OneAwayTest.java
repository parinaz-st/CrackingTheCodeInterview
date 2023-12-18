package com.cracking.questions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class OneAwayTest {
    OneAway oneAway = new OneAway();
    @Test
    public void given_2OneAwayStrings_SameLength_returnTrue(){
        assertTrue(oneAway.oneAway("pale", "cale"));
        assertTrue(oneAway.oneAway("pale", "pale"));
    }
    @Test
    public void given_2OneAwayStrings_InsertRemove_returnTrue(){
        assertTrue(oneAway.oneAway("pal", "pale"));
        assertTrue(oneAway.oneAway("pale", "pal"));
    }
    @Test
    public void given_2NotOneAwayStrings_SameLength_returnFalse(){
        assertFalse(oneAway.oneAway("cad", "pal"));
    }
    @Test
    public void given_2NotOneAwayStrings_InsertRemove_returnFalse(){
        assertFalse(oneAway.oneAway("plb", "pal"));
    }

}
