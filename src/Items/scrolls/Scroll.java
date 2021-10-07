package Items.scrolls;

import Items.Item;
import Stores.Player;

import java.awt.*;

public abstract class Scroll extends Item {
    private String feature;

    public Scroll(int price, String feature) {
        super(price);
        this.feature = feature;
    }

    public Scroll(String feature) {
        this.feature = feature;
    }
    @Override
    public void apply(Player player) {
        System.out.println("Using Scroll! " + feature);
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
