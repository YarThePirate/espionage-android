package com.uncc.gamejam49er.espionage;

import com.uncc.gamejam49er.espionage.items.Item;

/**
 * Created by Megan on 10/24/2015.
 */
public class Player {
    private Item[] inventory = new Item[2];
    private String[] intel;
    private int rank;
    private String faction;

    public Player() {
        rank = 0;
    }

    /**

     * Replace the in Item with the out Item in the inventory
     * @param in
     * @param out
     */
    public void replaceItems(Item in, Item out) {
        if (inventory[0].getName().equals(in.getName())) {
            inventory[0] = out;
        }
        else if (inventory[1].getName().equals(in.getName())) {
            inventory[1] = in;
        }
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String[] getIntel() {
        return intel;
    }

    public void setIntel(String[] intel) {
        this.intel = intel;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }
}
