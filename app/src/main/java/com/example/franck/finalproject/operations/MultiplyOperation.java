package com.example.franck.finalproject.operations;
/*
Создайте класс MinusOperation переопределив метод calculate, не забудьте реализовать интерфейс Operation, создайте функцию public long multiply(long a, long b)
 */
public class MultiplyOperation implements Operation {
    public long multiply(long a, long b) {
        return a * b;
    }

    @Override
    public long calculate(long a, long b) {
        return multiply(a, b);
    }
}
