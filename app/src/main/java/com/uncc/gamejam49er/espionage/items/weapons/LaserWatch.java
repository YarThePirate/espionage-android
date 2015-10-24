package com.uncc.gamejam49er.espionage.items.weapons;

/**
 * Created by Megan on 10/24/2015.
 */
public class LaserWatch extends Weapon {

    public LaserWatch() {
        setName("Laser Watch");
        setAttackValue(6);
        setDescription("Check the time and kill your enemies. Attack Value: " + getAttackValue());
    }
}
