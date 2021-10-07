package Stores;

import Items.Item;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int goldenCoins = 1000;
    private List<Item> backpack = new ArrayList <>();
    private int power;

    public Player(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Player() {
    }

    public void addInBackpack(Item item){
       backpack.add(item);
    }
    public void deleteSmthInBackpack(Item item){
        backpack.remove(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoldenCoins() {
        return goldenCoins;
    }

    public void setGoldenCoins(int goldenCoins) {
        this.goldenCoins = goldenCoins;
    }

    public List <Item> getBackpack() {
        return backpack;
    }

    public void setBackpack(List <Item> backpack) {
        this.backpack = backpack;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
