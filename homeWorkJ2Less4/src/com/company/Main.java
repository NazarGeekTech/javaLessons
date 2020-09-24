package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            Runner runner = new Runner("Runner",i);
            Thread thread = new Thread(runner);
            thread.start();

            try {
                thread.join();
                thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}



