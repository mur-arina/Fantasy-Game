package Items.swords;

import Items.Item;
import Items.Weapon;
import Stores.Player;

public abstract class Sword extends Weapon {
    private int damage;

    public Sword(int price, int damage) {
        super(price);
        this.damage = damage;
    }

    @Override
    public void apply(Player player) {
        System.out.println("Using Sword to kill Monsters!");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    public Sword(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
