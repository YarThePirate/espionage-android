package com.uncc.gamejam49er.espionage.items.armor;

import com.uncc.gamejam49er.espionage.items.Item;

/**
 * Created by Megan on 10/23/2015.
 */
public class Armor extends Item {
    protected int defenseValue;
    protected int attackValue;

    public Armor() {
        defenseValue = 0;
        attackValue = 0;
    }

    public Armor(String name, int defenseValue) {
        this.name = name;
        this.defenseValue = defenseValue;
    }

    public Armor(String name, int defenseValue, String description) {
        this.name = name;
        this.defenseValue = defenseValue;
        this.description = description;
    }

    public Armor(String name, int defenseValue, int attackValue, String description) {
        this.name = name;
        this.defenseValue = defenseValue;
        this.description = description;
        this.attackValue = attackValue;
    }

    public Armor(String name, int defenseValue, String description, Item[] hardCounter) {
        this.name = name;
        this.defenseValue = defenseValue;
        this.description = description;
        this.hardCounter = hardCounter;
        this.attackValue = 0;
    }

    public Armor(String name, int defenseValue, int attackValue, String description, Item[] hardCounter) {
        this.name = name;
        this.defenseValue = defenseValue;
        this.description = description;
        this.attackValue = attackValue;
        this.hardCounter = hardCounter;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }


}
