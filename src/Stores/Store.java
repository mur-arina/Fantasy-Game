package Stores;

import Items.Item;

public abstract class Store {
    private int cashBox;

    public Store(int cashBox) {
        this.cashBox = cashBox;
    }

    public Store() {
    }

    public int getCashBox() {
        return cashBox;
    }

    public void setCashBox(int cashBox) {
        this.cashBox = cashBox;
    }

    public abstract Item getItem();


    public void buyItem(Item item, Player player) {
        if(player.getGoldenCoins() >= item.getPrice() && getSize() > 0) {
            player.setGoldenCoins(player.getGoldenCoins() - item.getPrice());
            setCashBox(getCashBox() + item.getPrice());
            deleteFromStock(item);
            player.addInBackpack(item);
        }
        return;
    }
    public abstract int getSize();
    public abstract void addToStock(Item item);
    public  abstract void deleteFromStock(Item item);


}
