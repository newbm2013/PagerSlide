package com.example.user.pagerslide;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = findViewById(R.id.viewPager);
        pagerAdapter = new CistomPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if ( viewPager.getCurrentItem() == 0){

        };


    }
}
