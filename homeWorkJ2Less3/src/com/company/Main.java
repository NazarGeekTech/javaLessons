package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
d)  Написать Main класс где бы создавался счет клиента. Положить 20 000 сом на счет.
e)  Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом,
при этом отлавливать исключение LimitException и при возникновении такого исключения снимать только ту сумму которая осталась на счете и завершать бесконечный цикл*/
        BankAccount account = new BankAccount(10000);
        account.deposit(10000);
        account.withDraw(6000);




    }


}

