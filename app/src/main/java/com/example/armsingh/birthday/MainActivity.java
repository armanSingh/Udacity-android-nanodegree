package com.example.armsingh.birthday;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private String POPULAR_MOVIES;
    private String STAWK_HAWK;
    private String BUILD_IT_BIGGER;
    private String MAKE_UR_APP_MATERIAL;
    private String GO_UBIQUITOUS;
    private String CAPSTONE_MY_OWN_APP;
    private String TOAST_DISPLAY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        POPULAR_MOVIES = getResources().getString(R.string.popular_movies);
        STAWK_HAWK = getResources().getString(R.string.stock_hawk);
        BUILD_IT_BIGGER = getResources().getString(R.string.build_it_bigger);
        MAKE_UR_APP_MATERIAL = getResources().getString(R.string.make_your_app_material);
        GO_UBIQUITOUS = getResources().getString(R.string.go_ubiquitous);
        CAPSTONE_MY_OWN_APP = getResources().getString(R.string.capstone_my_own_app);
        TOAST_DISPLAY = getResources().getString(R.string.toast_display_message);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public void displayToastPopularMovies(View view){
        Context context = getApplicationContext();
        CharSequence displayText = TOAST_DISPLAY + POPULAR_MOVIES.toLowerCase();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, displayText, duration);
        toast.show();
    }

    public void displayToastStockHawk(View view){
        Context context = getApplicationContext();
        CharSequence displayText = TOAST_DISPLAY + POPULAR_MOVIES.toLowerCase();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, displayText, duration);
        toast.show();
    }

    public void displayToastBuildItBigger(View view){
        Context context = getApplicationContext();
        CharSequence displayText = TOAST_DISPLAY + POPULAR_MOVIES.toLowerCase();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, displayText, duration);
        toast.show();
    }

    public void displayToastMakeUrAppMaterial(View view){
        Context context = getApplicationContext();
        CharSequence displayText = TOAST_DISPLAY + POPULAR_MOVIES.toLowerCase();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, displayText, duration);
        toast.show();
    }

    public void displayToastGoUbiquitous(View view){
        Context context = getApplicationContext();
        CharSequence displayText = TOAST_DISPLAY + POPULAR_MOVIES.toLowerCase();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, displayText, duration);
        toast.show();
    }

    public void displayToastCapstone(View view){
        Context context = getApplicationContext();
        CharSequence displayText = TOAST_DISPLAY + POPULAR_MOVIES.toLowerCase();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, displayText, duration);
        toast.show();
    }
}
