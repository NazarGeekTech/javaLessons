package com.company;


public class Runner implements Runnable {
    private String name;
    private int number;
    boolean direction = false;

    public Runner(String name, int number) {
        this.name = name;
        this.number = number;
    }


    public String getName() {
        return name;
    }


    @Override
    public void run() {
        synchronized (this) {
            if (!direction) {
                System.out.println(this.getName() + " " + this.number + " gets a stick ");
                System.out.println(this.getName() + " " + this.number + " runs to " + this.getName() + " " + ++this.number);

            }

            if (this.number == 5) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + " " + this.number + " gets a stick ");
                System.out.println(this.getName() + " " + this.number + " runs to  finish");

                for (int i = 5; i >= 1; i--) {
                    System.out.println(this.getName() + " " + this.number + " runs to " + this.getName() + " " + --this.number);
                    System.out.println(this.getName() + " " + this.number + " gets a stick ");
                    if (i == 2){
                        break;
                    }
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }



        }

    }
}


