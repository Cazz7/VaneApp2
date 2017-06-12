package com.projects.cristianzapata.vaneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);

//        View viewLayout = getLayoutInflater().inflate(R.layout.custom_tab_title, null);
//        View viewTitle = viewLayout.findViewById(R.id.tabTitle);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
//        viewTitle.add
        tabLayout.addTab(tabLayout.newTab().setText("Fábula"));
        tabLayout.addTab(tabLayout.newTab().setText("Personajes"));
        tabLayout.addTab(tabLayout.newTab().setText("Nuestras voces"));
        tabLayout.addTab(tabLayout.newTab().setText("Reflexiona"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        final pagerAdapter pAdapter = new pagerAdapter
                (getSupportFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(pAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener( new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        } );

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(view.getContext(), MainActivity.class);
                startActivity(main);
            }
        });
    }

}
