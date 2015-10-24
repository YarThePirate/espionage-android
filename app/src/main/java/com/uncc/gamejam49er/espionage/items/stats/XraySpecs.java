package com.uncc.gamejam49er.espionage.items.stats;

import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.powers.ViewEnemyItems;

/**
 * Created by Megan on 10/24/2015.
 */
public class XraySpecs extends Item {
    public XraySpecs() {
        this.name = "X-Ray Specs";
        this.description = "See your enemy's items.";
        this.attackValue = 0;
        this.power = new ViewEnemyItems();
    }
}
