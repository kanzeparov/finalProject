package com.example.franck.finalproject.operations;

public class MultiplyOperation implements Operation {
    public long multiply(long a, long b) {
        return a * b;
    }

    @Override
    public long calculate(long a, long b) {
        return multiply(a, b);
    }
}
