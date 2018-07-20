package com.example.franck.finalproject.operations;
/*
Создайте класс PlusOperation переопределив метод calculate, не забудьте реализовать интерфейс Operation
 */
public class PlustOperation implements Operation {
    @Override
    public long calculate(long a, long b) {
        return a + b;
    }
}
