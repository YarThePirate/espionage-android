package com.uncc.gamejam49er.espionage.items.armor;

import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.weapons.ButterKnife;
import com.uncc.gamejam49er.espionage.items.weapons.Pistol;
import com.uncc.gamejam49er.espionage.items.weapons.Shiv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Megan on 10/24/2015.
 */
public class KevlarVest extends Item {

    List<Item> immunities = new ArrayList<Item>(Arrays.asList(new Shiv(), new ButterKnife(), new Pistol()));

    public KevlarVest() {
        this.name = "Kevlar Sweater Vest";
        this.attackValue = 0;
        this.description = "Gain immunity to the pistol, shiv, and butter knife, and be the talk of the whole Christmas party.";
        this.hardCounters.addAll(immunities);
    }
}
