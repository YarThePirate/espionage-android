package com.uncc.gamejam49er.espionage;


/**
 * Created by Megan on 10/23/2015.
 */
public class Item {
    private String name;
    private String description;
    private Item[] hardCounter;
    private String imgRes;

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

    public Item[] getHardCounter() {
        return hardCounter;
    }

    public void setHardCounter(Item[] hardCounter) {
        this.hardCounter = hardCounter;
    }
}

