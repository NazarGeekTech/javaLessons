package com.company;

public class Main {

    public static void main(String[] args) {


        Consumer<Double,Integer,Integer,Double> tv = new Consumer<>(new Double(12.34),new Integer(30),new Integer(30),new Double(21.1));
        tv.billMaker(tv.getAmountUsage(),tv.getConsume());
        tv.calculatorDues(Consumer.billingDay , tv.getPayed());
        System.out.println("next consumer");
        Consumer<Double,Double,Integer,Double> fridge = new Consumer<>(new Double(32.2),new Double(23.2),new Integer(30),new Double(12.32));
        fridge.billMaker(fridge.getConsume(),fridge.getAmountUsage());
        fridge.calculatorDues(Consumer.billingDay,fridge.getPayed());






    }
}
