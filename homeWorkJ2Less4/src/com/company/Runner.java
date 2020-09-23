package com.company;





public class Runner implements Runnable{
    private String name;




    public Runner(String name) {
        this.name = name;
    }
public String getName (){
        return name;
}

    @Override
    public void run() {
        synchronized (this) {

        }

    }
}
