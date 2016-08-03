package com.iamtomriddle.aboutme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "+919468267176"));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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

    public void onFace(View v){
        Intent newIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com"));
        startActivity(newIntent);
    }

    public void onGoog(View v){
        Intent newIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://plus.google.com/101390564836850074348/posts"));
        startActivity(newIntent);
    }

    public void onInsta(View v){
        Intent newIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://instagram.com"));
        startActivity(newIntent);
    }
    public void onTwit(View v){
        Intent newIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://https://twitter.com/faiX25"));
        startActivity(newIntent);
    }
}
