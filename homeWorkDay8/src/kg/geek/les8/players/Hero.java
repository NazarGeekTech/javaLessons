package kg.geek.les8.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility{

    private SuperAbility superAbility;

    public Hero(int damage, int health, SuperAbility superAbility) {
        super(damage, health);
        this.superAbility = superAbility;

    }

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }
}
