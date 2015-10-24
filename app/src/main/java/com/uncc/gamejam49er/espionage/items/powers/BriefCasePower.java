package com.uncc.gamejam49er.espionage.items.powers;

import com.uncc.gamejam49er.espionage.Player;

/**
 * Created by Matt on 10/24/2015.
 */
public class BriefCasePower extends Power {
    @Override
    public void postAttack(Player player) {
        // Prevent the player's intel from being seen after losing an attack
        //player.showIntel = false;
    }
}
