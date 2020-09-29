package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Downloader implements Runnable {
    private Uploader uploader;
    private CountDownLatch cDl;
    private Semaphore semaphore;
    private int user;


    public Downloader(Uploader uploader, CountDownLatch cDl, Semaphore semaphore, int user) {
        this.semaphore = semaphore;
        this.cDl = cDl;
        this.uploader = uploader;
        this.user = user;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            cDl.countDown();
            System.out.println("User " + user + " waiting for loading ");
            cDl.await();
            Thread.sleep(4000);
            semaphore.acquire();
            System.out.println("User " + user + " started loading the " + uploader.getName());
            Thread.sleep(4000/*uploader.getFileSize()/(uploader.getLoadSpeed()*5)*/);
            System.out.println("User " + user + " has completed downloading " + uploader.getName());
            semaphore.release();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



