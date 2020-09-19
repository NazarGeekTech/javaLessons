package com.company;

public class LimitException extends Exception {
    /*a)  Написать класс проверяемого исключения LimitException,
    с конструктором LimitException(String message, double remainingAmount) и методом getRemainingAmount().*/
    private  double remainingAmount;


    public LimitException(String message, double remainingAmount){
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public  double getReamingAmount(){
        return remainingAmount;
    }





}
