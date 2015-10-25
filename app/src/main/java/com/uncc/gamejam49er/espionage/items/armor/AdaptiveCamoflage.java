package com.uncc.gamejam49er.espionage.items.armor;

import com.uncc.gamejam49er.espionage.items.weapons.BroachFlameThrower;
import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.weapons.ButterKnife;
import com.uncc.gamejam49er.espionage.items.weapons.KillerNanoBugs;
import com.uncc.gamejam49er.espionage.items.weapons.LaserWatch;
import com.uncc.gamejam49er.espionage.items.weapons.Pistol;
import com.uncc.gamejam49er.espionage.items.weapons.PoisonDartUmbrella;
import com.uncc.gamejam49er.espionage.items.weapons.XXXElephantMace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Megan on 10/24/2015.
 */
public class AdaptiveCamoflage extends Item {

    List<Item> immunities = new ArrayList<Item>(Arrays.asList(new Pistol(), new ButterKnife(), new LaserWatch(), new PoisonDartUmbrella(), new XXXElephantMace()));

    public AdaptiveCamoflage() {
        this.name = "Adaptive Camoflage Poncho";
        this.attackValue = 0;
        this.description = "Be completely immune to everything except nano bugs and flame throwers";
        this.hardCounters.addAll(immunities);
    }
}
