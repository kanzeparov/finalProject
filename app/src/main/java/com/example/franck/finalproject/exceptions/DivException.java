package com.example.franck.finalproject.exceptions;

/*
Напишите свой класс исключение (название класса и пронаследуйтесь от Exception)
Создайте приватное поле num;
публичный метод позволяющий узнать это значение getNum()
конструктор с двумя аргументами, первый аргумент message, второй num;
Не забудьте в аргументе вызвать конструктор супер класса super(message)
 */

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
