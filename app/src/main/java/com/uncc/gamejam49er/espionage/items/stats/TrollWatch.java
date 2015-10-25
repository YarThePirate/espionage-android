package com.uncc.gamejam49er.espionage.items.stats;

import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.powers.TrollWatchPower;

/**
 * Created by Megan on 10/24/2015.
 */
public class TrollWatch extends Item {
    public TrollWatch() {
        this.name = "Troll Watch";
        this.description = "Re-roll opponent's luck bonus.";
        this.attackValue = 0;
        this.power = new TrollWatchPower();
    }
}
