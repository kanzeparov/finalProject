package com.example.franck.finalproject.operations;

import com.example.franck.finalproject.exceptions.DivException;
/*
Создайте класс DivOperation переопределив метод calculate,
не забудьте реализовать интерфейс Operation, не забудьте выкинуть исключение, если b=0
 */
public class DivOperation implements Operation {
    @Override
    public long calculate(long a, long b) throws DivException {
        if(b == 0) {
            throw new DivException("Divide on zero", (int)b);
        }
        return a / b;
    }
}
