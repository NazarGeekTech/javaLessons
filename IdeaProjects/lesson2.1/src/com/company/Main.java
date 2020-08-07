package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int digit = 2;
        switch (digit) {
            case 1:
                System.out.println("date equal to 1");
                break;
            case 2:
                System.out.println("date equal to 2");
                break;
            case 3:
                System.out.println("date equal to 3");
                break;
            default:
                System.out.println("date is unknown");
                break;
        }

        String name = "Omurzak";
        switch (name) {
            case "Mahabat":
                System.out.println("Hello Mahabat");
                break;
            case "Tilek":
                System.out.println("Hello Tilek");
                break;
            case "Nazar":
                System.out.println("Hello Nazar");
                break;
            case "Omurzak":
                System.out.println("Hello Omurzak");
                break;
            default:
                System.out.println("Hello");
                break;
        }


        // lesson2.1

        int tempereture = 25;
        boolean isRainy = true;
        if (tempereture > 15 && tempereture < 35) {  // true && (and) false
            System.out.println("can go for walk");
        }
        if (tempereture > 15 || isRainy) { //false || (or) true
            System.out.println("just stay at home ");
        }

        if (!isRainy) { //operator disline ! ( not)
            System.out.println("no need to take a umbrella  ");
        }


        if (tempereture > 15 && (tempereture < 35 || !isRainy)) {
            System.out.println("some word");
        } // first inside the scope and multipling and adding;


        printPhrases();
        printPhrases();
        printPhrases();
        addition(2, 4, "hello");

        int result;
        result = multiplicatiion(2, 3) - multiplicatiion(4, 5);
        System.out.println(result);

        System.out.println(concat("Aidana", "Dosalieva", 45.6));

    }

    //lesson2,3
//    without parameters


    public static void printPhrases() {
        System.out.println("GeekTech");
        System.out.println("Java");
        System.out.println("Hello");

    }

    public static void test() {
        int a = 9;
        System.out.println(a + 10);
    }

    //    method
    public static void addition(int num1, int num2, String text) {
        System.out.println(num1 + num2 + " " + text);

    }

//    multiplication
    public static int multiplicatiion(int num1, int num2){

        return num1 * num2;
    }

// concatination

    public static String concat(String t1, String t2, double number){

        return  t1 + " " + t2 + " " + number;
    }




}
