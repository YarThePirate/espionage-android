package com.uncc.gamejam49er.espionage;

import android.provider.LiveFolders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class DisplayItemActivity extends AppCompatActivity {

    Button display_go_back_button;
    Button display_take_button;
    ImageView display_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_item);

        //Initialize the views
        display_go_back_button = (Button) findViewById(R.id.goBackItemView);
        display_take_button = (Button) findViewById(R.id.takeItemView);
        display_img = (ImageView) findViewById(R.id.ItemImageItemView);

        // Set default image resources on imageView
        display_img.setImageResource(R.mipmap.ic_launcher);


        Intent intent = getIntent();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
