package com.cracking.questions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class StringRotationTest {
    StringRotation stringRotation = new StringRotation();
    @Test
    public void given_2_rotated_strings_return_true(){
        assertTrue(stringRotation.isRotation("waterbottle", "erbottlewat"));
    }
    @Test
    public void given_2_Not_rotated_strings_return_false(){
        assertFalse(stringRotation.isRotation("waterbottle", "erbottlewt"));
    }
}
