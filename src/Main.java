import Items.Item;
import Items.bows.BattleBow;
import Items.bows.Bow;
import Items.rings.GoldenRing;
import Items.rings.Ring;
import Items.rings.SilverRing;
import Items.scrolls.CurseScroll;
import Items.scrolls.HypnoseEyes;
import Items.scrolls.Scroll;
import Items.swords.IronSword;
import Items.swords.Sword;
import Items.swords.WoodenSword;
import Stores.BookStore;
import Stores.JewelryStore;
import Stores.Player;
import Stores.Smithy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("John",100);
        System.out.println("Playing : " + player1.getName());
        System.out.println("Your power: " + player1.getPower());
        System.out.println("Your balance: " + player1.getGoldenCoins());
        System.out.println("In your backpack: " + player1.getBackpack());
        System.out.println();
        Random random = new Random();

        Smithy smithy = new Smithy(0);
        JewelryStore jewelryStore = new JewelryStore(0);
        BookStore bookStore = new BookStore(0);

        for(int i = 0; i < random.nextInt(3) + 1; i++) {
            Sword sword1 = new WoodenSword(random.nextInt(2)*100 + 100,10 );
            Sword sword2 = new IronSword(random.nextInt(2)*100 + 100,20);
            Bow bow1 = new BattleBow(random.nextInt(2)*100 + 100, 10);

            smithy.addToStock(sword1);
            smithy.addToStock(sword2);
            smithy.addToStock(bow1);

            System.out.println("At the smithy's you can buy: "  + sword1 + " at the price: " + sword1.getPrice() + ", " + sword2 + " at the price: " + sword2.getPrice()+  ", " + bow1+ " at the price: " + bow1.getPrice());
        }
        for(int i = 0; i < random.nextInt(3)+1;i++) {
            Ring ring1 = new SilverRing(random.nextInt(2)*100 + 100, "Top up the power");
            Ring ring2 = new GoldenRing(random.nextInt(2)*100 + 100,"Lame the Monster");

            jewelryStore.addToStock(ring1);
            jewelryStore.addToStock(ring2);

            System.out.println("At the jewelry store you can buy: " + ring1 + " at the price: " + ring1.getPrice() + ", " + ring2 + " at the price: " + ring2.getPrice());

        }
        for(int i = 0; i < random.nextInt(3) + 1; i++){
            Scroll scroll1 = new CurseScroll(random.nextInt(2)*100 + 100,"Destroy all the swords in radius of 100km");
            Scroll scroll2 = new HypnoseEyes(random.nextInt(2)*100 + 100," Paralyse all the monsters in radius of 100km");

            bookStore.addToStock(scroll1);
            bookStore.addToStock(scroll2);

            System.out.println("At the bookstore you can purchase: " + scroll1 + " at the price: " + scroll1.getPrice()+ ", " + scroll2 + " at the price: " + scroll2.getPrice());
        }

        while (player1.getGoldenCoins() > 0) {
            smithy.buyItem(smithy.getItem(),player1);
            jewelryStore.buyItem(jewelryStore.getItem(), player1);
            bookStore.buyItem(bookStore.getItem(), player1);
        }


        System.out.println("\n\nYou have bought " + player1.getBackpack());
        System.out.println("Your money balance: " + player1.getGoldenCoins());
        System.out.println("Now in your backpack " + player1.getBackpack() + " Feel free to use" + "\n\n");


        for( Item item : player1.getBackpack()){
            item.apply(player1);
        }




    }
}
