package com.uncc.gamejam49er.espionage;

/**
 * Created by Megan on 10/24/2015.
 */
public class SploojBomb extends Stat {
    public SploojBomb() {
        setName("Splooj Bomb");
        setDescription("Immunity to nano and fire");
        setHardCounter(new Item[] {new KillerNanoBugs(), new BroachFlameThrower()});
    }
}
