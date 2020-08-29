package kg.geek.les8.players;

import java.util.Random;

public class Thor extends Hero {

    public Thor(int damage, int health) {
        super(damage, health, SuperAbility.MAKES_SLEEP_THE_BOSS);
    }
        public static boolean is_Sleeping = false;

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        Random ran = new Random();
        int ranForWarrior = ran.nextInt(3)+1;
        if (ranForWarrior == 1){
            is_Sleeping = true;
            System.out.println(" boss Sleeps ZzZzZzZzZ");
        }else {
            is_Sleeping = false;
            System.out.println("Boss is awake ");
        }

    }
}
