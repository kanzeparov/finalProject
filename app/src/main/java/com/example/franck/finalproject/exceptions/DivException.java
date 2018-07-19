package com.example.franck.finalproject.exceptions;

public class DivException extends Exception{
    private int num;
    public int getNum() {
        return num;
    }

    public DivException(String message, int num) {
        super(message);
        this.num = num;
    }
}
