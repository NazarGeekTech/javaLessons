package com.company;


import kg.geek.less6.homeWork.Weapon;

public class Main {

    public static void main(String[] args) {
        Boss bossInfo = new Boss(300, 50);

        Weapon weapon = new Weapon("<<Shooter>>", "<<AK-47>>");
        bossInfo.setWeapon(weapon);


        System.out.println(" All about Boss " + " Boss Health >> " + bossInfo.getHealth()
                + " boss damage >> " + bossInfo.getDamage()
                + " boss's name of weapon " + bossInfo.getWeapon().getNameOfWeapon()
                + " boss's weapon type " + bossInfo.getWeapon().getTypeOfWeapon());

    }
}
