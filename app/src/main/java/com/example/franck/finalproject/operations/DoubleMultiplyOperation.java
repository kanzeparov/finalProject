package com.example.franck.finalproject.operations;

public class DoubleMultiplyOperation extends MultiplyOperation implements Operation {
    @Override
    public long calculate(long a, long b) {
        return multiply(multiply(a,b), b);
    }
}
