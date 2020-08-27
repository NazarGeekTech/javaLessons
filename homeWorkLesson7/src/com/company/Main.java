package com.company;

import kg.Geek.HomeWork.Lesson7.*;
import kg.Geek.HomeWork.Lesson7.Magic;
import kg.Geek.HomeWork.Lesson7.Warrior;
import kg.Geek.HomeWork.Lesson7.HavingSuperAbility;

public class Main {

    public static void main(String[] args) {
        HavingSuperAbility medic = new Medic(300, 0, "can heal");
        HavingSuperAbility magic = new Magic(400, 50, "can fight");
        HavingSuperAbility warrior = new Warrior(300, 50, "can chop of the head");
        HavingSuperAbility[] superAbilities = {medic, magic, warrior};

        for (HavingSuperAbility h : superAbilities) {
            if (h == superAbilities[0]) {
                h.applySuperAbility("MEDIC HEALED");
            } else if (h == superAbilities[1]) {
                h.applySuperAbility("MAGICAL DAMAGE");
            } else {
                h.applySuperAbility("CRITICAL DAMAGE");
            }
        }

    }
}
