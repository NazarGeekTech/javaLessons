package kg.geek.les8.players;


public class Tank extends Hero {

    public Tank(int damage, int health) {
        super(damage, health, SuperAbility.TAKES_1_5_DAMAGE_FROM_BOSS);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (!Thor.is_Sleeping){
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i] != this) {
                    heroes[i].setHealth(heroes[i].getHealth() + (boss.getDamage() / 5));
                }
            }
            this.setHealth(this.getHealth() - (boss.getDamage() / 5) * heroes.length);
        }
    }
}
