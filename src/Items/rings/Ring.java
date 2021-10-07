package Items.rings;

import Items.Item;
import Stores.Player;

public abstract class Ring extends Item{
    private String feature;

    public Ring(int price, String feature) {
        super(price);
        this.feature = feature;
    }

    public Ring(String feature) {
        this.feature = feature;
    }

    @Override
    public void apply(Player player) {
        System.out.println("Using Ring! " + feature);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }


    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
