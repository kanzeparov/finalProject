package com.example.franck.finalproject.operations;

//Exception

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
    public long calculate(long a, long b) {
        return loop(a,b);
    }
}
