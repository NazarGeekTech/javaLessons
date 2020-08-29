package kg.geek.les8.players;

public class Medic extends Hero {
    private String name;
    private int healPoint;

    public Medic(int damage, int health, int healPoint, String name) {
        super(damage, health, SuperAbility.HEAL);
        this.healPoint = healPoint;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i] != this){
                heroes[i].setHealth(heroes[i].getHealth()+ healPoint);
            }
        }
    }
}
