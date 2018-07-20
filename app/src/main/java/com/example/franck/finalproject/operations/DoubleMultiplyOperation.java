package com.example.franck.finalproject.operations;
/*
Создайте класс DoubleMultiplyOperation переопределив метод calculate, не забудьте реализовать интерфейс Operation, отнаследуйтесь от MultiplyOperation и используйте функцию multiply
 */
public class DoubleMultiplyOperation extends MultiplyOperation implements Operation {
    @Override
    public long calculate(long a, long b) {
        return multiply(multiply(a,b), b);
    }
}
