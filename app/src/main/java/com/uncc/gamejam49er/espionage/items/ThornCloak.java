package com.uncc.gamejam49er.espionage.items;

/**
 * Created by Megan on 10/24/2015.
 */
public class ThornCloak extends Armor {
    public ThornCloak() {
        setName("Thorn Cloak");
        setDefenseValue(5);
        setAttackValue(3);
        setDescription("Spike your enemies just by having them attack you");
        setHardCounter(new Item[] {new KillerNanoBugs(), new BroachFlameThrower()});

    }
}
