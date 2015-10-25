package com.uncc.gamejam49er.espionage.items.stats;

import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.powers.ReWatchPower;

/**
 * Created by Megan on 10/24/2015.
 */
public class ReWatch extends Item {
    public ReWatch() {
        this.name = "Re-watch";
        this.description = "Re-roll your luck bonus.";
        this.attackValue = 0;
        this.power = new ReWatchPower();
    }
}
