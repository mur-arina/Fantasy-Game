package Stores;

import Items.Item;
import Items.Weapon;
import Items.rings.Ring;
import Items.scrolls.CurseScroll;
import Items.scrolls.Scroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookStore extends Store {
    private List<Scroll> scrolls = new ArrayList <>();

    public BookStore(int cashBox) {
        super(cashBox);
    }

    public BookStore() {
    }

    @Override
    public Item getItem() {
        if(getSize() > 0) {
            return scrolls.get(new Random().nextInt(scrolls.size()));
        } return new CurseScroll("");
    }

    @Override
    public void addToStock(Item item) {
        if(item instanceof Scroll) {
            scrolls.add((Scroll)item);
        } else {
            System.out.println("Impossible to add! Only Scrolls here)");
        }

    }
    @Override
    public int getSize() {
        return scrolls.size();
    }

    @Override
    public void deleteFromStock(Item item) {
        scrolls.remove(item);

    }

    public List <Scroll> getScrolls() {
        return scrolls;
    }
}
