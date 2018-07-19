package com.example.franck.finalproject.exceptions;

public class PowException extends Exception {
    private int num;
    public int getNum() {
        return num;
    }

    public PowException(String message, int num) {
        super(message);
        this.num = num;
    }
}
