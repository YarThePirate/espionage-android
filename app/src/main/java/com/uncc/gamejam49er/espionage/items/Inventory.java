package com.uncc.gamejam49er.espionage.items;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matt on 10/24/2015.
 */
public class Inventory {
    private List<Item> itemList = new ArrayList<Item>();
    private List<Item> hardCounters = new ArrayList<Item>();
    private int attackStrength = 0;

    /**
     * Adds an item to the inventory
     * updates the inventory's total attack strength
     * and hardcounters with the stuff from the item
     *
     * @param item
     */
    public void addItem(Item item) {
        itemList.add(item);
        hardCounters.addAll(item.getHardCounters());
        attackStrength += item.getAttackValue();
    }

    /**
     * Removes an item and its hardcounters from the list
     * and subtracts its attack value from the total
     *
     * @param item
     */
    public void removeItem(Item item) {
        for (Item counteredItem : item.getHardCounters()) {
            hardCounters.remove(counteredItem);
        }
        itemList.remove(item);
    }

    /**
     * Return number of items in the inventory
     *
     * @return
     */
    public int getTotalItems() {
        return itemList.size();
    }

    /**
     * Returns the total attack value for the items in the inventory
     *
     * @return
     */
    public int getAttackValue() {
        return attackStrength;
    }
}
