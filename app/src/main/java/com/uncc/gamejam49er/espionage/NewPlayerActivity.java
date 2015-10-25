package com.uncc.gamejam49er.espionage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.weapons.Shiv;
import com.uncc.gamejam49er.espionage.items.stats.SmokeBomb;
import com.uncc.gamejam49er.espionage.items.armor.TwoPieceSuit;

import java.io.FileOutputStream;

public class NewPlayerActivity extends AppCompatActivity {
    public final static String EXTRA_VIEW_ITEM = "com.uncc.gamejam49er.espionage.EXTRA_VIEW_ITEM";
    public final static String SELECT_ITEM = "com.uncc.gamejam49er.espionage.SELECT_ITEM";
    public final static String FILENAME = "PlayerValues";
    public final static String FILENAMETWO = "IntelValues";


    Button start_weapon_button;
    Button start_armor_button;
    Button start_stat_button;
    ImageView item_1;
    ImageView item_2;
    int itemsSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // Declare the items
        // It's probably not good that these are hardcoded;
        // See if there's a mo betterer way to do this
        Item start_weapon = new Shiv();
        Item start_armor = new TwoPieceSuit();
        Item start_stat = new SmokeBomb();

        // Initialize the Views
        start_weapon_button = (Button) findViewById(R.id.start_weapon);
        start_armor_button = (Button) findViewById(R.id.start_armor);
        start_stat_button = (Button) findViewById(R.id.start_stat);
        item_1 = (ImageView) findViewById(R.id.img_inv_1);
        item_2 = (ImageView) findViewById(R.id.img_inv_2);

        // Attach the associated items to the buttons so they can be retrieved later
        start_weapon_button.setTag(start_weapon);
        start_armor_button.setTag(start_armor);
        start_stat_button.setTag(start_stat);

        // Set default image resources on imageViews
        item_1.setImageResource(R.mipmap.ic_launcher);
        item_2.setImageResource(R.mipmap.ic_launcher);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Update images with items
        Intent intent = getIntent();
        if (intent.getStringExtra(SELECT_ITEM) != null) {
            if (itemsSelected == 1) {
                itemsSelected = 2;
                //item_2.setImageResource();
            }
            else {
                itemsSelected++;
                //item_1.setImageResource();
            }
        }
        else {
            itemsSelected = 0;
        }
    }

    public void displayItem(View view) {
        Item selectedItem = (Item) view.getTag();
        Intent intent = new Intent(this, DisplayItemActivity.class);
        intent.putExtra(EXTRA_VIEW_ITEM, selectedItem.getName());
        startActivity(intent);
    }

    // ADDD done BUTTON!!!!!
    public void done(View view) {
        //After you've got all the items
        Player player = new Player();
        String string = player.getFaction() + "\n" +
                player.getRank() + "\n";
//                player.getInventory()[0] + "\n" +
//                player.getInventory()[1];
        FileOutputStream outputStream;

        try {
            outputStream = openFileOutput(FILENAME, Context.MODE_PRIVATE);
            outputStream.write(string.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String values = "";
        for (int i = 0; i < player.getIntel().length; i++) {
            values += player.getIntel()[i] + "\n";
        }
        try {
            outputStream = openFileOutput(FILENAMETWO, Context.MODE_PRIVATE);
            outputStream.write(string.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        Intent intent = new Intent(this, SpyDilemnaActivity.class);
        startActivity(intent);
    }

    /**
     * Changes Second image view to default image
     * and first image view to the second images view
     * and reduces items selected count
     * @param view
     */
    public void deleteItemOneOnNewPlayerView(View view) {
        if (itemsSelected > 0) {
            item_1.setImageResource(R.mipmap.ic_launcher); //CHANGE TO item_2 PIC
            itemsSelected--;
            item_2.setImageResource(R.mipmap.ic_launcher);
        }
    }

    /**
     * Changes Second image view to default image
     * and reduces items selected count
     * @param view
     */
    public void deleteItemTwoOnNewPlayerView(View view) {
        if (itemsSelected == 2) {
            itemsSelected--;
            item_2.setImageResource(R.mipmap.ic_launcher);
        }
    }

}
