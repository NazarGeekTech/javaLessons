package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        CountDownLatch cdl = new CountDownLatch(10);
        Semaphore sem = new Semaphore(4);
        for (int i = 1; i <= cdl.getCount(); i++) {
            new Passengers(i, sem, cdl).start();
        }
        try {
            cdl.await();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("We got lil announcement  , all passenger got into the board bus will be traveling from the East side " +
                    "enjoy your trip!");
    }
}
