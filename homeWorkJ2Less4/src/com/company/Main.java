package com.company;

import javax.swing.*;
import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
//        this side to count all the way ,
        for (int i = 2; i <= 5; i++) {
            Runner runner = new Runner("runner ");
            Thread thread = new Thread(runner);
//this minus i just to get the correct number of the runner or else it would be the on higher due to the sout which i'm increasing with ++i ;
            System.out.println(runner.getName() + --i + " gets a stick ");
            thread.start();
            try {
                thread.join();
                thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(runner.getName() + i + " runs to " + runner.getName() + ++i);
            if (i == 5) {
                System.out.println(runner.getName() + i + " gets a stick  ");
                System.out.println(runner.getName() + i + " runs to finish ");
            }

        }
// this thread for counting down starts
        for (int i = 4; i >= 1; i--) {
            Runner runner = new Runner("runner ");
            Thread thread = new Thread(runner);
            if(i == 4){
                System.out.println(runner.getName() + ++i + " runs to " + runner.getName() + --i);
            }else {
                System.out.println(runner.getName() + ++i + " gets a stick ");
                thread.start();
                try {
                    thread.join();
                    thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(runner.getName() + i + " runs to " + runner.getName() + --i);
            }
        }
        System.out.println("Runner 1 gets a stick");
    }
}



