package com.example.franck.finalproject.operations;

public class CountOperation {
    public int incCount() {
        int a = 0;
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        return a++;
    }
}
