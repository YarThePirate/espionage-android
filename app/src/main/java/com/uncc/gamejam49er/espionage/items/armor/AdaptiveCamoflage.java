package com.uncc.gamejam49er.espionage.items.armor;

import com.uncc.gamejam49er.espionage.items.weapons.BroachFlameThrower;
import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.weapons.KillerNanoBugs;

/**
 * Created by Megan on 10/24/2015.
 */
public class AdaptiveCamoflage extends Armor {

    public AdaptiveCamoflage() {
        setName("Adaptive Camoflage Poncho");
        setDefenseValue(6);
        setDescription("Be completely invisible to nano bugs and flame throwers. Defense Value: " + getDefenseValue());
        setHardCounter(new Item[]{new KillerNanoBugs(), new BroachFlameThrower()});
    }
}
