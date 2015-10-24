package com.uncc.gamejam49er.espionage;

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
