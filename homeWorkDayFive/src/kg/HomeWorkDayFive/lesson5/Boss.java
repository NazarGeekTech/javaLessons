package kg.HomeWorkDayFive.lesson5;

public class Boss {
    private int health;
    private int bossDamage;
    private String typeOfDefence;

    public Boss(int health, int bossDamage, String typeOfDefence) {
        this.health = health;
        this.bossDamage = bossDamage;
        this.typeOfDefence = typeOfDefence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getTypeOfDefence() {
        return typeOfDefence;
    }

    public void setTypeOfDefence(String typeOfDefence) {
        this.typeOfDefence = typeOfDefence;
    }
}
