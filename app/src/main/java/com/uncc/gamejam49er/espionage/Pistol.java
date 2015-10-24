package com.uncc.gamejam49er.espionage;

/**
 * Created by Megan on 10/24/2015.
 */
public class Pistol extends Weapon{
    public Pistol() {
        setName("Pistol");
        setAttackValue(5);
        setDescription("Shoot your enemy down. attack Value: " + getAttackValue());
    }
}