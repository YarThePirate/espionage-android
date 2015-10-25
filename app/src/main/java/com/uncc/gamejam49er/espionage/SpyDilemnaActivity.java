package com.uncc.gamejam49er.espionage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SpyDilemnaActivity extends AppCompatActivity {
    public final static String EXTRA_VIEW_DILEMNA_ITEM = "com.uncc.gamejam49er.espionage.EXTRA_VIEW_DILEMNA_ITEM";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spy_dilemna);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_spy_dilemna, menu);
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

    public void attackOption(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(EXTRA_VIEW_DILEMNA_ITEM, "ATTACK");
        startActivity(intent);
    }

    public void bargainOption(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(EXTRA_VIEW_DILEMNA_ITEM, "BARGAIN");
        startActivity(intent);
    }

    public void defendOption(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(EXTRA_VIEW_DILEMNA_ITEM, "DEFEND");
        startActivity(intent);
    }
}
