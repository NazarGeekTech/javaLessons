package com.company;

import DuringTheLesson.Color;
import DuringTheLesson.Dog;
import DuringTheLesson.Shelter;
import kg.geek.homeworkJ2.less1.*;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setName("BulBul");
        dog1.setBreed("German dog");
        dog1.setCommands(new String[] {"run", "sniff","dance"});
        System.out.println(dog1.getInfo());
        dog1.makeVoice(4,"gav gav");


        Dog dog2 = new Dog("alaba","KG type",Color.WHITE,new Shelter("Son-Kol","Naryn District"));
        System.out.println(dog2.getInfo());
        dog2.makeVoice("bold voice like real Lion");

//        Dog3 with variable created to use on Shelter
        Shelter shelter = new Shelter("Stayer #123","George Town 22a");
        Dog dog3 = new Dog("Hummer","Bulldog",Color.BROWN,shelter,new String[] {"hand shake","greet","roll over"});
        System.out.println(dog3.getInfo());
        dog3.makeVoice("courage voice to make afraid",3);
      //end of the practical work during the lesson-1


/* new start with HomeWork  */
        MobilePhone mobi = new MobilePhone(2020, new PhoneMergeStory("California", "China"),
                TypeOfBatteries.NI_CD, "regular", " all-in-one processor");
        System.out.println(mobi.allAboutPhone());
        mobi.daileTo(0706262036, "Temirlan");
        mobi.daileTo("Aman",0703324355,"Yssyk-Kol");
        mobi.daileTo("Joan");
        mobi.orderAPhone("unique type of body", 2019);


//        second object
        System.out.println("__________________");
        IPhone iPhone = new IPhone(2020,TypeOfBatteries.LITHIUM_ION_BATTERY,"Edge shape","AMD-processor",
                "8-th generation","8XR",CurrentLevelOfBattery.HIGH);
        System.out.println(iPhone.allAboutPhone());
        mobi.daileTo(0703253,"George");
        mobi.daileTo("Adilet",0702324565,"Ala-Archa");
        mobi.daileTo("Emma");


        //        third  object
        System.out.println("__________________");
        IPhone iPhone1 = new IPhone(2020,new PhoneMergeStory("USA","Singapore"),TypeOfBatteries.NICKEL_M_HYDRIDE,
                " snake shaped form with Singaporean technology",
                "HiSilicon Kirin 980","10-generation"," XXR on XR");
        System.out.println(iPhone1.allAboutPhone());
        iPhone1.daileTo(042344,"Aidar");
        iPhone1.daileTo("Maria",3124949,"Ukraine");
        iPhone1.daileTo("Ariet");






    }
}
