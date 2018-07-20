package com.example.franck.finalproject;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.franck.finalproject.exceptions.DivException;
import com.example.franck.finalproject.exceptions.NotNumberException;
import com.example.franck.finalproject.exceptions.PowException;
import com.example.franck.finalproject.operations.CountOperation;
import com.example.franck.finalproject.operations.DivOperation;
import com.example.franck.finalproject.operations.DoubleMultiplyOperation;
import com.example.franck.finalproject.operations.MinusOperation;
import com.example.franck.finalproject.operations.MultiplyOperation;
import com.example.franck.finalproject.operations.PlustOperation;
import com.example.franck.finalproject.operations.PowOperation;


/*
Выпускной проект

 Класс наследник +
  Интерфейс +
   Инкапсуляция +
    Структура массив +
    Примитивы +
    Преобразование типа +
     If,switch +
     Цикл +
     Возведение в степень через рекурсию +
     Возведение в степень через цикл +
     Конструкторы +
     Обработка исключения +
     Автосчетчик онлайн через треды +
     Абстрактный класс +
     Abstract +
     Class +
     Operation A, b, equals +
     Plus oper +
     MinusOper +
     multoper  +
      Divoper +
      Zeroarithm
      SchetThrwasOper +
      PowOper two meth recursion, cicle +
Exception not chislo +
 Not divide +
 Debugt
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText firstNum;
    private EditText secondNum;
    private Button countBtn;
    private TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum = findViewById(R.id.firstNumEt);
        secondNum = findViewById(R.id.secondNumEt);
        countBtn = findViewById(R.id.countBtn);
        answer = findViewById(R.id.answerText);

        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Handler handler = new Handler(getMainLooper());
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                answer.setText("" + new CountOperation().incCount());
                            }
                        }, 1000);
                    }
                }).start();
            }
        });
    }

    @Override
    public void onClick(View v) {
        int a = 1000000;
        int b = 1000000;

        try {
            if(firstNum.getText() == null || secondNum.getText() == null) {
                throw new NotNumberException("Input numbers");
            }
            a = new Integer(firstNum.getText().toString());
            b = new Integer(secondNum.getText().toString());
        } catch (Exception e) {
            showError(e.getMessage());
        }



        switch (v.getId()) {
            case R.id.plusBtn:
                answer.setText("" + new PlustOperation().calculate(a,b));
                break;
            case R.id.minusBtn:
                answer.setText("" + new MinusOperation().calculate(a,b));
                break;
            case R.id.mltBtn:
                answer.setText("" + new MultiplyOperation().calculate(a,b));
                break;
            case R.id.doublemltBtn:
                answer.setText("" + new DoubleMultiplyOperation().calculate(a,b));
                break;
            case R.id.powBtn:
                try {
                    answer.setText("" + new PowOperation().calculate(a, b));
                } catch (PowException e) {
                    showError(e.getMessage());
                }
                break;
            case R.id.divBtn:
                try {
                    answer.setText("" + new DivOperation().calculate(a, b));
                } catch (DivException e) {
                    showError(e.getMessage());
                }
                break;
            case R.id.stopBtn:
                answer.setText("push button");
                break;
        }
    }

    public void showError(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }
}
