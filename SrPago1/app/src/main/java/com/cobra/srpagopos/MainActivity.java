package com.cobra.srpagopos;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cobra.srpagopos.adapter.TabPagerAdapter;
import com.cobra.srpagopos.widgets.SlidingTabLayout;

import org.xmlpull.v1.XmlPullParser;


public class MainActivity extends AppCompatActivity {

    ViewPager mViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewpager = (ViewPager)findViewById(R.id.viewpager);
        TabPagerAdapter tabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager(), this);
        mViewpager.setAdapter(tabPagerAdapter);
        SlidingTabLayout mSlidingTabLayout = (SlidingTabLayout)findViewById(R.id.sliding_tabs);
        mSlidingTabLayout = (SlidingTabLayout)findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setBackgroundColor(Color.rgb(224, 224, 224));
        mSlidingTabLayout.setSelectedIndicatorColors(Color.TRANSPARENT);
        mSlidingTabLayout.setDividerColors(Color.TRANSPARENT);
        mSlidingTabLayout.setFixedTabs(true);
        mSlidingTabLayout.setTextColor(getResources().getColorStateList(R.color.sr_pago_tab_text));
        mSlidingTabLayout.setViewPager(mViewpager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
