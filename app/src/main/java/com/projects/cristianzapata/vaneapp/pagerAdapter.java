package com.projects.cristianzapata.vaneapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by cristian.zapata on 11-06-2017.
 */

public class pagerAdapter extends FragmentStatePagerAdapter {

    int mNumTabs;
    public pagerAdapter(FragmentManager fm, int NumTabs) {
        super(fm);
        this.mNumTabs = NumTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                tabFabula fabula = new tabFabula();
                return fabula;
            case 1:
                tabPersonajes personajes = new tabPersonajes();
                return personajes;
            case 2:
                tabVoces voces = new tabVoces();
                return voces;
            case 3:
                tabReflexion reflexion = new tabReflexion();
                return reflexion;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumTabs;
    }
}
