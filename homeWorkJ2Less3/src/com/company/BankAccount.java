package com.company;

import java.util.Scanner;

public class BankAccount {
    /*
b)  Написать класс BankAccount с 1 полем double amount - остаток на счете и методами getAmount() - возвращает текущий остаток на счете,
    deposit(double sum) - положить деньги на счет, withDraw(int sum) - снимает указанную сумму со счета.*/
    private double amount;

    Scanner userInput = new Scanner(System.in);


    public BankAccount(double amount) {
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount = (amount + sum);
    }

    /*  Также метод withDraw() может сгенерировать исключение в том случае если запрашиваемая сумма на снятие больше чем остаток денег на счете.*/
    public void withDraw(int sum) {

        while (true) {
            if (amount < sum) {
                try {
                    throw new LimitException("Your desired amount to withdraw is above of your money in your account ", this.getAmount());
                } catch (LimitException e) {
                    System.out.println(e.getMessage() + this.amount);

                }
                /*When it faces to Exception will work this part*/
                finally {
                    System.out.print("Would  you like to withdraw the reaming money (yes/no)...? : ");
                    String answer = userInput.next();
                    if (answer.equals("yes")) {
                        withDraw((int) amount);
                        System.out.println(amount);
                    }
                    if (answer.equals("no")) {

                        break;
                    }

                }
            }
            if (amount >= sum) {
                System.out.println(amount);
                this.amount -= sum;
            }
            if (amount == (double) 0) {
                break;
            }

        }
    }
}



