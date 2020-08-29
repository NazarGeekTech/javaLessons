package kg.geek.les8.game;

import kg.geek.les8.players.*;

public class RPG_Game {

    public static void startGame() {
        Boss boss = new Boss(50, 1400);

        Warrior warrior = new Warrior(20, 100);
        Medic old_docR = new Medic(0, 100, 10, "old_DocR");
        Magic magic = new Magic(15, 150);
        Medic medic = new Medic(20, 200, 5, "jr.Medic");
        Golem golem = new Golem(10, 100);
        Thor thor = new Thor(20,100);
        Tank tank = new Tank(10,300);
        Witcher witcher = new Witcher(0,300);


        Hero[] heroes = {warrior, old_docR, magic, medic, golem,thor,tank,witcher,};
        printStatistics(boss, heroes, medic, old_docR);

        while (!isGameFinished(boss, heroes)) {
            round(boss, heroes, medic, old_docR);
        }

    }

    private static void round(Boss boss, Hero[] heroes, Medic medic, Medic doctor) {
        if (boss.getHealth() > 0 && !Thor.is_Sleeping) {
            bossHit(boss, heroes);
        }
        heroesHit(boss, heroes);
        printStatistics(boss, heroes, medic, doctor);
        applySuperAbility(boss, heroes);


    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes Won !!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss Won  !!!");
        }
        return allHeroesDead;
    }
public static int round = 0;
    private static void printStatistics(Boss boss, Hero[] heroes, Medic medic, Medic doctor) {
        System.out.println("___________________");


        System.out.println("Boss Health: " + boss.getHealth());
//        customized for medic and doctor even though the possibility of hard coding is high ;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] == heroes[1]) {
                System.out.println(doctor.getName() + " heath " + heroes[1].getHealth());
                continue;
            }
            if (heroes[i] == heroes[3]) {
                System.out.println(medic.getName() + " health " + heroes[3].getHealth());
                continue;
            } else {
                System.out.println(heroes[i].getClass().getSimpleName() + " health : " + heroes[i].getHealth());
            }
        }
        System.out.println("___________________");
    }

    private static void bossHit(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());


        }
    }

    private static void heroesHit(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0)
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());
        }

    }

    /*https://www.youtube.com/watch?v=f02mOEt11OQ coding music*/
    private static void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility(boss, heroes);
        }
    }


}
