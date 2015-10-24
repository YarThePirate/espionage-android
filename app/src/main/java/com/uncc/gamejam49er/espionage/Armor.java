package com.uncc.gamejam49er.espionage;

/**
 * Created by Megan on 10/23/2015.
 */
public class Armor extends Item {
    private int defenseValue;
    private int attackValue;

    public Armor() {
        defenseValue = 0;
        attackValue = 0;
    }

    public Armor(String name, int defenseValue) {
        setName(name);
        this.defenseValue = defenseValue;
        attackValue = 0;
    }

    public Armor(String name, int defenseValue, String description) {
        setName(name);
        this.defenseValue = defenseValue;
        this.attackValue = 0;
        setDescription(description);
    }

    public Armor(String name, int defenseValue, int attackValue, String description) {
        setName(name);
        this.defenseValue = defenseValue;
        setDescription(description);
        this.attackValue = attackValue;
    }

    public Armor(String name, int defenseValue, String description, Item[] hardCounter) {
        setName(name);
        this.defenseValue = defenseValue;
        setDescription(description);
        setHardCounter(hardCounter);
        this.attackValue = 0;
    }

    public Armor(String name, int defenseValue, int attackValue, String description, Item[] hardCounter) {
        setName(name);
        this.defenseValue = defenseValue;
        this.attackValue = attackValue;
        setDescription(description);
        this.setHardCounter(hardCounter);
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
