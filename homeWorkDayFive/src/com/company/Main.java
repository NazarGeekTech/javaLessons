package com.company;

import kg.HomeWorkDayFive.lesson5.Boss;
import kg.HomeWorkDayFive.lesson5.Hero;



public class Main {



    public static void main(String[] args) {
        Boss boss = new Boss(280,80,"--Ultra Defence--");

        System.out.println("About Boss " + boss.getHealth() + " "+
                " Boss defence type " + boss.getTypeOfDefence() +
                " Boss damage " + boss.getBossDamage());
// assigned new array method to this variable ;
        Hero[] heroes = creatHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(" Heroes Characteristic " +
                    " Health -> " + heroes[i].getHealth() +
                    " heroes Damage  -> " + heroes[i].getDamage() +
                    " heroes super ability -> " + heroes[i].getSuperAbility());
        }



    }
//    additional home Work to crate method which creates heroes through constructor;
    public static Hero[] creatHeroes (){
        Hero mcCree = new Hero(250,55);
        Hero hayabusa = new Hero(300,40,"slippery bustard");
        Hero freeman = new Hero(350, 60, "hunter on long range");
        Hero[] heroes = {mcCree,hayabusa,freeman};
        return heroes;
    }


}
/*
 1.McCree
 2.Hayabusa
 3.Freeman
 4. Agent 47
 5.Max Payne*/