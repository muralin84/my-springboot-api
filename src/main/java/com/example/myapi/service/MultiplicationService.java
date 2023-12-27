package com.example.myapi.service;

import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
}