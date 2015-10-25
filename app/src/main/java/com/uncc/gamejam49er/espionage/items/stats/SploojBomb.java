package com.uncc.gamejam49er.espionage.items.stats;

import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.weapons.BroachFlameThrower;
import com.uncc.gamejam49er.espionage.items.weapons.KillerNanoBugs;
import com.uncc.gamejam49er.espionage.items.weapons.XXXElephantMace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Megan on 10/24/2015.
 */
public class SploojBomb extends Item {

    List<Item> immunities = new ArrayList<Item>(Arrays.asList(new XXXElephantMace(), new BroachFlameThrower()));

    public SploojBomb() {
        this.name = "Splooj Bomb";
        this.description = "Immunity to mace and fire";
        this.attackValue = 0;
        this.hardCounters.addAll(immunities);
    }
}
