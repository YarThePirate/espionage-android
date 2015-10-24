package com.uncc.gamejam49er.espionage.items.armor;

import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.weapons.Pistol;

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
