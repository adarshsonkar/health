package com.example.android.healthmanager;

import android.app.ActionBar;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainCalorie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calorie);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addfood = new Intent(MainCalorie.this, add_food.class);
                startActivity(addfood);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.

        getMenuInflater().inflate(R.menu.maincalorie_menu, menu);
        return true;
    }
    public void open_add_totalcalorie(View v) {
        Intent addtotalCalorie = new Intent(MainCalorie.this, Add_Total_Calorie.class);
        startActivity(addtotalCalorie);
    }
    public void open_suggestions(View v) {
        Intent suggest = new Intent(MainCalorie.this, suggestions.class);
        startActivity(suggest);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the "Insert dummy data" menu option
            case R.id.action_insert_dummy_data:
                Intent home= new Intent(MainCalorie.this,MainActivity.class);
                startActivity(home);
                return true;
            // Respond to a click on the "Delete all entries" menu option
            case R.id.action_delete_all_entries:
                Intent Login= new Intent(MainCalorie.this,LoginActivity.class);
                startActivity(Login);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
