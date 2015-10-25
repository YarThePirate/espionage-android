package com.uncc.gamejam49er.espionage.items.powers;

import android.content.Intent;

import com.uncc.gamejam49er.espionage.Player;
import com.uncc.gamejam49er.espionage.items.Inventory;
import com.uncc.gamejam49er.espionage.items.Item;

import java.util.List;

/**
 * Created by Matt on 10/24/2015.
 */
public class ViewEnemyItems extends Power {
    private final static String EXTRA_ENEMY_ITEM_BASE = "com.uncc.gamejam49er.espionage.ENEMY_ITEM_";

    @Override
    public void preAttack(Player enemy) {
        /*Intent intent = new Intent(this, ViewInventoryActivity.class);
        List<Item> enemyItems = enemy.getInventory().getItems();
        int count = 1;
        for (Item item : enemyItems) {
            intent.putExtra(EXTRA_ENEMY_ITEM_BASE + count, item.getName());
        }*/
    }
}
