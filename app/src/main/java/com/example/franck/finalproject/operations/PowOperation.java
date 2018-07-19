package com.example.franck.finalproject.operations;

//Exception

import com.example.franck.finalproject.exceptions.PowException;

public class PowOperation implements Operation {

    private long recurtion(long a, long n) {
        if(n == 1) {
            return a;
        } else {
            return recurtion(a, n-1) * a;
        }
    }

    private long loop(long a, long n) {
        int answer = 1;
        for(int i = 0; i < n; i++) {
            answer *= a;
        }

        return answer;
    }

    @Override
    public long calculate(long a, long b) throws PowException {
        if(b < 1) {
            throw new PowException("I can pow number more than 1", (int)b);
        }
        return loop(a,b);
    }
}
