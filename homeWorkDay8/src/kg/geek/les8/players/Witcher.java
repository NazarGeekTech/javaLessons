package kg.geek.les8.players;


public class Witcher extends Hero {

    public Witcher(int damage, int health) {
        super(damage, health, SuperAbility.CAN_GIVE_OWN_LIVE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i <heroes.length ; i++) {
            if (heroes[i].getHealth() <= 0){
                heroes[i].setHealth(this.getHealth());
                this.setHealth(0);
                System.out.println(this.getClass().getSimpleName() + " does his ability and gave own live ");
                return;

            }
        }


    }
}
