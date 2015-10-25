package com.uncc.gamejam49er.espionage.items.armor;

import com.uncc.gamejam49er.espionage.items.weapons.BroachFlameThrower;
import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.weapons.ButterKnife;
import com.uncc.gamejam49er.espionage.items.weapons.KillerNanoBugs;
import com.uncc.gamejam49er.espionage.items.weapons.PoisonDartUmbrella;
import com.uncc.gamejam49er.espionage.items.weapons.Shiv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Megan on 10/24/2015.
 */
public class ThornCloak extends Item {

    List<Item> immunities = new ArrayList<Item>(Arrays.asList(new Shiv(), new ButterKnife(), new PoisonDartUmbrella()));

    public ThornCloak() {
        this.name = "Thorn Cloak";
        this.attackValue = 2;
        this.description = "Spike your enemies just by having them attack you! Gain immunity to knives and the umbrella.";
        this.hardCounters.addAll(immunities);
    }
}
