package kg.geek.les8.players;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int damage, int health) {
        super(damage, health, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random ran = new Random();
        int ranForWarrior = ran.nextInt(3)+2;
//        if (this.getDamage() == 20){
//            this.setDamage(this.getDamage() + ranForWarrior);
//        }
//        System.out.println(this.getClass().getSimpleName() + "  " + ranForWarrior);

    }
}
