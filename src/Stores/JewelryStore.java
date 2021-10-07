package Stores;

import Items.Item;
import Items.Weapon;
import Items.rings.GoldenRing;
import Items.rings.Ring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JewelryStore extends Store {
    private List<Ring> rings = new ArrayList <>();

    public JewelryStore(int cashBox) {
        super(cashBox);
    }

    public JewelryStore() {
    }

    @Override
    public Item getItem() {
        if(getSize() > 0) {
            return rings.get(new Random().nextInt(rings.size()));
        } return new GoldenRing("");
    }

    @Override
    public void addToStock(Item item) {
        if(item instanceof Ring) {
            rings.add((Ring) item);
        } else {
            System.out.println("Impossible to add! Only Rings here)");
        }

    }
    @Override
    public int getSize() {
        return rings.size();
    }

    @Override
    public void deleteFromStock(Item item) {
        rings.remove(item);

    }
    public List <Ring> getRings() {
        return rings;
    }
}
