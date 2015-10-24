package com.uncc.gamejam49er.espionage.items;


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

    public String getImgRes() {
        return imgRes;
    }

    public void setImgRes(String imgRes) {
        this.imgRes = imgRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getHardCounters() {
        return hardCounters;
    }

    public void setHardCounters(List<Item> hardCounters) {
        this.hardCounters.addAll(hardCounters);
    }

    public int getAttackValue() {
        return attackValue;
    }
}

