package kg.geek.les8.players;

public class Golem extends Hero {

    public Golem(int damage, int health) {
        super(damage, health, SuperAbility.SAVE_DAMAGE_AND_REVERT);




    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth()-(boss.getDamage()/5));
    }
}
