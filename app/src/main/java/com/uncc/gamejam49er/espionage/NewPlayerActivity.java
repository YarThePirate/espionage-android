package com.uncc.gamejam49er.espionage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.Shiv;
import com.uncc.gamejam49er.espionage.items.SmokeBomb;
import com.uncc.gamejam49er.espionage.items.TwoPieceSuit;

public class NewPlayerActivity extends AppCompatActivity {
    public final static String EXTRA_VIEW_ITEM = "com.uncc.gamejam49er.espionage.EXTRA_VIEW_ITEM";

    Button start_weapon_button;
    Button start_armor_button;
    Button start_stat_button;
    ImageView item_1;
    ImageView item_2;

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
    }

    public void displayItem(View view) {
        Item selectedItem = (Item) view.getTag();
        Intent intent = new Intent(this, DisplayItemActivity.class);
        intent.putExtra(EXTRA_VIEW_ITEM, selectedItem.getName());
    }

}
