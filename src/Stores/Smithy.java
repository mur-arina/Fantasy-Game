package Stores;

import Items.Buyable;
import Items.Item;
import Items.Weapon;
import Items.swords.WoodenSword;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Smithy extends Store{
    private List<Weapon> weapons = new ArrayList <>();

    public Smithy(int cashBox) {
        super(cashBox);
    }

    @Override
    public Item getItem() {
        if(getSize()>0) {
           return weapons.get(new Random().nextInt(weapons.size()));
        }
        return new WoodenSword(0);
    }

    @Override
    public int getSize() {
        return weapons.size();
    }

    @Override
    public void addToStock(Item item) {
        if(item instanceof Weapon) {
            weapons.add((Weapon) item);
        } else {
            System.out.println("Impossible to add! Only Weapons here)");
        }
    }

    @Override
    public void deleteFromStock(Item item) {
        weapons.remove(item);
    }


}
