package com.company;





public class Runner implements Runnable{
    private String name;
    private  int number;



    public Runner(String name,int number){
        this.name = name;
        this.number  = number;
    }
    public Runner(String name) {
        this.name = name;
    }
public String getName (){
        return name;
}

    @Override
    public void run() {
        synchronized (this) {
                if (number == 1) {

                    for (int i = 1; i <= 5; i++) {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                            System.out.println(this.getName() + " " + this.number + " gets a stick ");
                            System.out.println(this.getName() + " " + this.number + " runs to " + this.getName() + " " + ++this.number);
                            if (i == 4) {
                                System.out.println(this.getName() + " " + this.number + " gets a stick ");
                                System.out.println(this.getName() + " " + this.number + " runs to finish");
                                break;
                            }
                        }


                }
                if (number == 5) {

                    for (int i = 5; i >= 1; i--) {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(this.getName() + " " + this.number + " runs to " + this.getName() + " " + --this.number);
                        System.out.println(this.getName() + " " + this.number + " gets a stick ");
                        if (i == 2) {
                            break;
                        }
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

