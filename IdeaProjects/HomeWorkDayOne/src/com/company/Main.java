package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String theUnivercity;
        final int num = 312;
        String word = " Can be any story!";
        theUnivercity = num + word;
        System.out.println(theUnivercity);

        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }


//        // additional home work;
//        Scanner userInput = new Scanner(System.in);
//        // this code gets users first name
//        String firstName;
//        System.out.print("Enter your first name: ");
//        firstName = userInput.next();
//
//        // this code gets users family name
//        String familyName;
//        System.out.print("Enter your family name: ");
//        familyName = userInput.next();
//
//        String fullName;
//        fullName = firstName + " " + familyName;
//        System.out.println("Whats Up " + fullName + " ?");
//
////        to get date in server
//        Date currentTime = new Date();
//        System.out.println(currentTime);
        Scanner userInput = new Scanner(System.in);

        String firstName;
        System.out.print("Enter your first name ");
        firstName = userInput.next();

        String lastName;
        System.out.print("Enter your lastName ");
        lastName = userInput.next();

        String fullName = firstName + " " + lastName;
        System.out.println("Whats going on " + fullName);


        System.out.println(fullName.indexOf("I"));
        System.out.println(fullName.replace("v", "V"));


        if (num != 34) {
            System.out.println("no one can do that");
        } else if (num == 35) {
            System.out.println("learn mone");
        } else {
            System.out.println("motivation");
        }
        Date toDaysDate = new Date();
        System.out.println(toDaysDate);
        char studentsLasrNameInitial = firstName.charAt(0);
        char studentsFirstNameInitial = lastName.charAt(0);
        System.out.println(studentsLasrNameInitial + " " + studentsFirstNameInitial);

        int mounth = 1;
        switch (mounth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febrary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
        }
        int i = 0;
        while (i < 6) {
            System.out.println(i);
            i++;
        }


    int indeedOne = 4;
        switch (indeedOne) {
            case 1:
                System.out.println("day when he came ");
                break;
            case 2:
                System.out.println("day when she fall in love");
                break;
            case 3:
                System.out.println("day when poeple showed up.");
                break;
            case 4:
                System.out.println("day when aroun the world get together");
                break;
        }
        Date currentTime = new Date();
        System.out.println(currentTime);

            int info = nameInfo(5, 8);
        System.out.println(info);
    }

    public static  int nameInfo(int a, int b) {
        return a + b;
    }
}
