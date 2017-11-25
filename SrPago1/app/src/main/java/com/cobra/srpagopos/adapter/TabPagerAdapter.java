package com.cobra.srpagopos.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import com.cobra.srpagopos.fragments.FragmentCompany;
import com.cobra.srpagopos.fragments.RechargeFragment;
import com.cobra.srpagopos.fragments.OperationsMainFragment;
import com.cobra.srpagopos.fragments.RecordEmailFragment;
import com.cobra.srpagopos.fragments.TicketRechargeFragment;


public class TabPagerAdapter extends FragmentPagerAdapter{
    private AppCompatActivity activity;
    private Context context;
    public TabPagerAdapter(FragmentManager fm, AppCompatActivity activity) {
        super(fm);
        this.activity = activity;
    }

    private int[] imageResId = {
            R.drawable.aa,
            R.drawable.images,
            R.drawable.aa,
            R.drawable.images,
            R.drawable.aa
    };

    private int[] imageResSelected = {
            R.drawable.aa,
            R.drawable.images,
            R.drawable.aa,
            R.drawable.images,
            R.drawable.aa
    };

    @Override
    public CharSequence getPageTitle(int position) {

      return String.valueOf(imageResId[position]);
    }


    @Override
    public int getCount() {
        return imageResId.length;
    }



    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new OperationsMainFragment();
            case 1:
                return new RechargeFragment();
            case 2:
                return new RechargeFragment();
            case 3:
                return new TicketRechargeFragment();
            case 4:
                return new RecordEmailFragment();
            default:
                return null;
        }

    }



}