package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Passengers extends Thread {

    private int passengerNumber;
    private Semaphore semaphore;
    private CountDownLatch countDownLatch;


    public Passengers(int passengerNumber, Semaphore semaphore, CountDownLatch countDownLatch) {
        this.passengerNumber = passengerNumber;
        this.semaphore = semaphore;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(passengerNumber + " comes to get a ticket ");
            Thread.sleep(5000);
            System.out.println(passengerNumber + " gets the ticket \uD83C\uDFAB");
            semaphore.release();
            Thread.sleep(4000);
            countDownLatch.countDown();
            System.out.println(passengerNumber + " comes to takes a sit inside the bus \uD83D\uDE8C");
            Thread.sleep(5000);
            countDownLatch.await();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
