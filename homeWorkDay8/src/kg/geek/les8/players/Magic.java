package kg.geek.les8.players;


import java.util.Random;

public class Magic extends Hero {

    public Magic(int damage, int health) {
        super(damage, health, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random ran = new Random();
       int boostsDamageOfHeroes = ran.nextInt(10)+1;

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + boostsDamageOfHeroes);
        }
        System.out.println(this.getClass().getSimpleName() + " has boosted heroes damage up to " + boostsDamageOfHeroes);
    }
}
