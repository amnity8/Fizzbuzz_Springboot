package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The FizzBuzzControllerTest class.
 *  testing the FizzBuzzController class.
 */
class FizzBuzzControllerTest {

    private final FizzBuzzController fizzBuzzController = new FizzBuzzController();

    /**
     * Test case to verify the generation of FizzBuzz list for a given number.
     */
    //the input test will be 20
    @Test
    void getFizzBuzz_ReturnsFizzBuzzList() {
        int input = 20;

        ResponseEntity<List<String>> response = fizzBuzzController.getFizzBuzz(20);
        List<String> result = response.getBody();

        assertEquals(20, result.size()); //size should be 20

        assertTrue(result.contains("Fizz")); //result should contain fizz


        // Test for number = 1 (edge case)
        response = fizzBuzzController.getFizzBuzz(1);
        result = response.getBody();

        assertEquals(1, result.size());

        assertTrue(result.contains("1"));

        assertFalse(result.contains("Fizz"));


    }
}