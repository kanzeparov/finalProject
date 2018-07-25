package com.example.franck.finalproject.operations;
/*
Создайте класс MinusOperation переопределив метод calculate,
не забудьте реализовать интерфейс Operation
 */
public class MinusOperation implements Operation {
    @Override
    public long calculate(long a, long b) {
        return a - b;
    }
}
