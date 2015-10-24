package com.uncc.gamejam49er.espionage;

/**
 * Created by Megan on 10/23/2015.
 */
public class Weapon extends Item {

    private int attackValue;


    public Weapon(String name, int attackValue, String description) {
        this.attackValue = attackValue;
        setDescription(description);
        setName(name);
    }

    public Weapon(String name, int attackValue, String description, Item[] hardCounter) {
        this.attackValue = attackValue;
        setDescription(description);
        setHardCounter(hardCounter);
        setName(name);
    }

    public int getAttackValue() {

        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }


    public Weapon() {
    }
}
