package Items.bows;

import Items.Weapon;
import Stores.Player;

public abstract class Bow extends Weapon {
    private int damage;

    @Override
    public void apply(Player player) {
        System.out.println("Using Bow to attack villains!");
    }


    public Bow(int price, int damage) {
        super(price);
        this.damage = damage;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    public Bow(int damage) {
        this.damage = damage;
    }
}
