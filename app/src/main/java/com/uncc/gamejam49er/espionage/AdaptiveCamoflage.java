package com.uncc.gamejam49er.espionage;

/**
 * Created by Megan on 10/24/2015.
 */
public class AdaptiveCamoflage extends Armor {
    Armor kevlarVest = new Armor("Kevlar Sweater Vest",8, "Fire proof against the pistol", new Item[] {pistol});

    public AdaptiveCamoflage() {
        setName("Adaptive Camoflage Poncho");
        setDefenseValue(6);
        setDescription("Be completely invisible to nano bugs and flame throwers. Defense Value: " + getDefenseValue());
        setHardCounter(new Item[]{killerNanoBugs,broachFlameThrower});
    }
}
