package com.uncc.gamejam49er.espionage.items.armor;

import com.uncc.gamejam49er.espionage.items.powers.BriefCasePower;

/**
 * Created by Megan on 10/24/2015.
 */
public class BriefCase extends Armor {

    public BriefCase() {
        this.name = "Indestructable Self-Destructing Briefcase";
        this.attackValue = 0;
        this.power = new BriefCasePower();
        this.description = "This briefcase will protect your intelligence from just about anything - except itself";
    }
}
