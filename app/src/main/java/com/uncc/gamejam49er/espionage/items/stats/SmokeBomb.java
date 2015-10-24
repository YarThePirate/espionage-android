package com.uncc.gamejam49er.espionage.items.stats;

import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.powers.SmokeBombPower;

/**
 * Created by Megan on 10/24/2015.
 */
public class SmokeBomb extends Item {
    public SmokeBomb() {
        this.name = "Smoke Bomb";
        this.description = "One half opponent luck roll";
        this.attackValue = 0;
        this.power = new SmokeBombPower();
    }
}
