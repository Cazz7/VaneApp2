package com.projects.cristianzapata.vaneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Reconciliación y perdón");
        toolbar.setSubtitle("");

        WebView bsWebView = (WebView) findViewById(R.id.base_social);
        WebView nlWebView = (WebView) findViewById(R.id.nuestra_labor);
        bsWebView.loadData(getString(R.string.bs_texto), "text/html; charset=utf-8", "utf-8");
        nlWebView.loadData(getString(R.string.nl_texto), "text/html; charset=utf-8", "utf-8");
//
//        WebView view = new WebView(this);
//        view.setVerticalScrollBarEnabled(false);
//
//        ((LinearLayout)findViewById(R.id.webview)).addView(view);
//
//        view.loadData(getString(R.string.bs_texto), "text/html; charset=utf-8", "utf-8");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_SHORT)
//                        .setAction("Action", null).show();
                Intent categories = new Intent(view.getContext(), categories.class);
                startActivity(categories);
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
}
