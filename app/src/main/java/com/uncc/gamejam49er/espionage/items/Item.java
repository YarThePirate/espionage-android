package com.uncc.gamejam49er.espionage.items;


import com.uncc.gamejam49er.espionage.items.powers.Power;

import java.util.List;

/**
 * Created by Megan on 10/23/2015.
 */
public class Item {
    protected String name;
    protected String description;
    protected int attackValue;
    protected List<Item> hardCounters;
    protected String imgRes;
    protected Power power;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public List<Item> getHardCounters() {
        return hardCounters;
    }

    public String getImgRes() {
        return imgRes;
    }

    /*public void setImgRes(String imgRes) {
        this.imgRes = imgRes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHardCounters(List<Item> hardCounters) {
        this.hardCounters.addAll(hardCounters);
    }*/
}

