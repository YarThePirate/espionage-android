package com.uncc.gamejam49er.espionage;

/**
 * Created by Megan on 10/24/2015.
 */
public class ThornCloak extends Armor {
    public ThornCloak() {
        //list of Armor
        setName("Thorn Cloak");
        setDefenseValue(5);
        setAttackValue(3);
        setDescription("Spike your enemies just by having them attack you");

        Armor adaptivCamoflage = new Armor("Adaptive Camoflage Poncho", 6,
                "Be completely invisible to nano bugs and flame throwers", new Item[]{killerNanoBugs,broachFlameThrower});
        Armor kevlarVest = new Armor("Kevlar Sweater Vest",8, "Fire proof against the pistol", new Item[] {pistol});
        //briefcase    }
    }
}
