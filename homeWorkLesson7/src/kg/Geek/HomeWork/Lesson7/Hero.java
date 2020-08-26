package kg.Geek.HomeWork.Lesson7;

public abstract class Hero implements HavingSuperAbility{
    private int health;
    private  int damage;
    private String typeOfSuperAbility;


    public Hero(int health, int damage, String typeOfSuperAbility) {
        this.health = health;
        this.damage = damage;
        this.typeOfSuperAbility = typeOfSuperAbility;
    }
    public Hero(){}
//   GETTERS
    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }


    public String getTypeOfSuperAbility() {
        return typeOfSuperAbility;
    }

}
