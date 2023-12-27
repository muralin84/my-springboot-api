package com.example.myapi.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationServiceTest {

    @Test
    public void testMultiply() {
        MultiplicationService multiplicationService = new MultiplicationService();
        int result = multiplicationService.multiply(2, 3);
        assertEquals(6, result);
    }
}