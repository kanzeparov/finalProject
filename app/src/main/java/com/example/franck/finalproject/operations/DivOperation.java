package com.example.franck.finalproject.operations;

import com.example.franck.finalproject.exceptions.DivException;

public class DivOperation implements Operation {
    @Override
    public long calculate(long a, long b) throws DivException {
        if(b == 0) {
            throw new DivException("Divide on zero", (int)b);
        }
        return a / b;
    }
}
