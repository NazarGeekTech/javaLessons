package com.company;

import kg.Geek.HomeWork.Lesson7.*;
import kg.Geek.HomeWork.Lesson7.Magic;
import kg.Geek.HomeWork.Lesson7.Warrior;
import kg.Geek.HomeWork.Lesson7.HavingSuperAbility;

public class Main {

    public static void main(String[] args) {
        HavingSuperAbility medic = new Medic(300,0,"MEDICAL");
        HavingSuperAbility magic = new Magic(400,50,"MEDICAL");
        HavingSuperAbility warrior = new Warrior(300,50,"CRITICAL");

//      и реализовать интерфейс HavingSuperAbility.
        Hero hero = new Hero() {
            @Override
            public void applySuperAbility(String superAbilityType) {
            }
        };
        HavingSuperAbility[] superAbilities = {medic, magic, warrior};
        for (HavingSuperAbility h : superAbilities) {
            getInfo(h);
        }
    }
    public static void getInfo(HavingSuperAbility power) {
        power.applySuperAbility("CRITICAL DAMAGE");
    }

}
