package com.uncc.gamejam49er.espionage.items;

/**
 * Created by Megan on 10/24/2015.
 */
public class KevlarVest extends Armor {

    public KevlarVest() {
        setName("Kevlar Sweater Vest");
        setDefenseValue(8);
        setDescription("Fire proof against the pistol. Defense Value: " + getDefenseValue());
        setHardCounter(new Item[] {new Pistol()});
    }
}
