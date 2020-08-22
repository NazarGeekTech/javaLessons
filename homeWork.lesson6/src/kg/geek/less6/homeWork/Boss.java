package kg.geek.less6.homeWork;

import kg.geek.less6.homeWork.GameEntity;
import kg.geek.less6.homeWork.Weapon;

public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
// calls constructor from subclass
    public Boss(int health, int damage) {
        super(health, damage);
    }


}
