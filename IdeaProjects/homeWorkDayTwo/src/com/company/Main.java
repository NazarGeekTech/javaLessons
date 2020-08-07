package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        5 types of executing to the console;
        System.out.println(getsTemperatureAndAge(30, 28));
        System.out.println(getsTemperatureAndAge(19, 25));
        System.out.println(getsTemperatureAndAge(49, -19));
        System.out.println(getsTemperatureAndAge(2, 8));
        System.out.println(getsTemperatureAndAge(+20, -113));

//        generates random numbers for age;
        System.out.println("можно ли идти гулять ? " + genereteRandomAge());




    }


    // returns age and temperature to this int;
    public static String getsTemperatureAndAge(int age, int temperature) {


        ////            method for returning  with conditional statement !
        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)) {
            return "May go for a walk";
        } else if (age < 20 && (temperature >= 0 || temperature < 28)) {
            return "Можно идти гулять";
        } else if (age > 45 && (temperature >= -10 || temperature <= 25)) {
            return "You may go for a walk";
        } else
            return "Stay at home nigga :))";


    }

//    additional home work to generate random numbers 
    public static int genereteRandomAge(){
        int age = (int)(Math.random()*((0 + 70)))+0;

        return age;





    }
}