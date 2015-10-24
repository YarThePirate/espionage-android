package com.uncc.gamejam49er.espionage;

import android.content.Intent;
import android.provider.LiveFolders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.armor.TwoPieceSuit;
import com.uncc.gamejam49er.espionage.items.stats.SmokeBomb;
import com.uncc.gamejam49er.espionage.items.weapons.Shiv;

public class DisplayItemActivity extends AppCompatActivity {
    public final static String EXTRA_VIEW_ITEM = "com.uncc.gamejam49er.espionage.EXTRA_VIEW_ITEM";
    public final static String SELECT_ITEM = "com.uncc.gamejam49er.espionage.SELECT_ITEM";

    Button display_go_back_button;
    Button display_take_button;
    TextView display_item_name;
    TextView display_item_description;
    ImageView display_img;

    Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_item);

        //Initialize the views
        display_go_back_button = (Button) findViewById(R.id.goBackItemView);
        display_take_button = (Button) findViewById(R.id.takeItemView);
        display_img = (ImageView) findViewById(R.id.ItemImageItemView);
        display_item_name = (TextView) findViewById(R.id.ItemNameDisplayItemView);
        display_item_description = (TextView) findViewById(R.id.ItemDescription);


        // Set default image resources on imageView
        display_img.setImageResource(R.mipmap.ic_launcher);

        Intent intent = getIntent();
        String itemName = intent.getStringExtra(EXTRA_VIEW_ITEM);
        //Declare item selected
        // Declare the items
        // It's probably not good that these are hardcoded;
        // See if there's a mo betterer way to do this
        Item start_weapon = new Shiv();
        Item start_armor = new TwoPieceSuit();
        Item start_stat = new SmokeBomb();

        if (start_armor.getName().equals(itemName)) {
            item = start_armor;
        }
        else if (start_stat.equals(itemName)) {
            item = start_stat;
        }
        else if (start_weapon.equals(itemName)){
            item = start_weapon;
        }

        //Give Views actual Item data
        display_item_name.setText(itemName);
        display_item_description.setText(item.getDescription());
        //display_img.setBackgroundResource(this.getResources().getIdentifier(item.getImgRes(), "drawable",
        //        this.getPackageName()));



    }

    public void goBackItemView(View view) {
        Intent intent = new Intent(this, NewPlayerActivity.class);
    }

    public void takeItemView(View view) {
        Intent intent = new Intent(this, NewPlayerActivity.class);
        intent.putExtra(SELECT_ITEM, item.getName());
    }
}
