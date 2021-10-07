package Items;

import Stores.Player;

public abstract class Item implements Buyable{
    private int price;


    public Item(int price) {
        this.price = price;

    }

    public Item() {
    }

    @Override
    public boolean buy() {
        return true;
    }

    public abstract void apply(Player player);

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                '}';
    }
}
