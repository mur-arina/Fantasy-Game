package Items.rings;

import Stores.Player;

public class SilverRing extends Ring {
    public SilverRing(int price, String feature) {
        super(price, feature);
    }

    public SilverRing(String feature) {
        super(feature);
    }


    public void apply(Player player) {
        player.setPower(player.getPower()+10);
        System.out.println("Power Topped up to " + player.getPower());
    }
}
