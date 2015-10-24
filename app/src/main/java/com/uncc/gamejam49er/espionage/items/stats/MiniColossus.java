package com.uncc.gamejam49er.espionage.items.stats;

import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.powers.MiniColossusPower;

/**
 * Created by Megan on 10/24/2015.
 */
public class MiniColossus extends Item {
    public MiniColossus() {
        this.name = "Mini Colossus";
        this.description = "See one extra intel after a successful attack.";
        this.attackValue = 0;
        this.power = new MiniColossusPower();
    }
}
