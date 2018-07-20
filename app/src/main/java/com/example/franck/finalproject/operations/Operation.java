package com.example.franck.finalproject.operations;

import com.example.franck.finalproject.exceptions.DivException;
import com.example.franck.finalproject.exceptions.PowException;
/*
Создайте интерфейс Operation определите в нем метод long calculate с параметрами a,b
 */
public interface Operation {

    long calculate(long a, long b) throws PowException, DivException;

}
