package com.example.user.pagerslide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by user on 11.01.18.
 */

public class CistomPagerAdapter extends FragmentPagerAdapter {


    public CistomPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0){
            return new CustomFragment();
        }
        if (position == 1){
            return new CustomFragment1();
        }
        if (position == 2){
        } return new CustomFragment2();


    }

    @Override
    public int getCount() {
        return 3;
    }
}
