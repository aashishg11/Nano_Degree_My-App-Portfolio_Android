package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /*
       This function displays the toast message corresponding to the view.
       @param view the view who wants to display the toast message.
     */
    public void displayToast(View view){

        // Gets the ID of the button and executes the corresponding case.
        switch (view.getId()){

                // Displays toast for spotify app
            case R.id.spotify_app:
                Toast spotifyToast = Toast.makeText(getApplicationContext(),
                        "This button will launch my Spotify App",
                        Toast.LENGTH_SHORT);
                spotifyToast.show();
                break;

                // Displays toast for scores app
            case R.id.scores_app:
                Toast scoresToast = Toast.makeText(getApplicationContext(),
                        "This button will launch my Scores App",
                        Toast.LENGTH_SHORT);
                scoresToast.show();
                break;

                // Displays toast for library app
            case R.id.library_app:
                Toast libraryToast = Toast.makeText(getApplicationContext(),
                        "This button will launch my Library App",
                        Toast.LENGTH_SHORT);
                libraryToast.show();
                break;

                // Displays toast for Build It Bigger app
            case R.id.bib_app:
                Toast bibToast = Toast.makeText(getApplicationContext(),
                        "This button will launch Build It Bigger",
                        Toast.LENGTH_SHORT);
                bibToast.show();
                break;

                // Displays toast for XYZ Reader app
            case R.id.reader_app:
                Toast readerToast = Toast.makeText(getApplicationContext(),
                        "This button will launch my XYZ Reader App",
                        Toast.LENGTH_SHORT);
                readerToast.show();
                break;

                // Displays toast for Capstone app
            case R.id.capstone_app:
                Toast capstoneToast = Toast.makeText(getApplicationContext(),
                        "This button will launch my Capstone App",
                        Toast.LENGTH_SHORT);
                capstoneToast.show();
                break;

        }// ends switch

    } // ends displayToast

} // ends main activity
