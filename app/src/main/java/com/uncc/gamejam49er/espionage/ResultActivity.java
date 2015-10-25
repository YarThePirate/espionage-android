package com.uncc.gamejam49er.espionage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class ResultActivity extends AppCompatActivity {
    public final static String FILENAME = "PlayerValues";
    public final static String FILENAMETWO = "IntelValues";
    public final static String EXTRA_VIEW_DILEMNA_ITEM = "com.uncc.gamejam49er.espionage.EXTRA_VIEW_DILEMNA_ITEM";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView = (TextView) findViewById(R.id.resultTextView);

        try {
            InputStream input = openFileInput(FILENAME);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Intent intent = getIntent();
        String option = intent.getStringExtra(EXTRA_VIEW_DILEMNA_ITEM);
        if (option.equals("ATTACK")) {
            Random rnd = new Random();
            int x = rnd.nextInt(10);
            if (x < 5) {
                textView.setText("You have decided to Attack, \n" +
                        "However, your opponent has decided to attack you. \n" +
                        "You have lost intel to him and gained nothing. \n " +
                        "Play again?");
            }
            else {
                textView.setText("You have decided to Attack, \n" +
                        "Your attack was succesful, you have gained intel! \n" +
                        "Play again?");

            }

        }
        else if (option.equals("BARGAIN")) {
            Random rnd = new Random();
            int x = rnd.nextInt(10);
            if (x < 5) {
                textView.setText("You have decided to bargain, \n" +
                        "However, your opponent has decided to attack you. \n" +
                        "You have lost intel to him and gained nothing. \n " +
                        "Play again?");
            }
            else {
                textView.setText("You have decided to bargain, \n" +
                        "Your trade was succesful, you have shared 2 intel and gained 2 as well! \n" +
                        "Play again?");

            }

        }
        else if (option.equals("DEFEND")) {
            textView.setText("You have survived, play again?");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result, menu);
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

    public void okButtonClicked(View view) {
        Intent intent = new Intent(this, SpyDilemnaActivity.class);
        startActivity(intent);
    }
}
