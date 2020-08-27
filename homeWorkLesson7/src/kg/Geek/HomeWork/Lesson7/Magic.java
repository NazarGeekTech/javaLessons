package kg.Geek.HomeWork.Lesson7;

public class Magic extends Hero {


    public Magic(int health, int damage, String typeOfSuperAbility) {
        super(health, damage, typeOfSuperAbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType);
    }
}
