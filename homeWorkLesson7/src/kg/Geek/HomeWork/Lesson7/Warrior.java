package kg.Geek.HomeWork.Lesson7;

public class Warrior extends Hero {


    public Warrior(int health, int damage, String typeOfSuperAbility) {
        super(health, damage, typeOfSuperAbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType);
    }
}
