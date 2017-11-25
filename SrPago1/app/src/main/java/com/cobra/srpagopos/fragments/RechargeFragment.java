package com.cobra.srpagopos.fragments;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cobra.srpagopos.R;

public class RechargeFragment  extends Fragment  {
    Fragment someFragment;
    public RechargeFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup view= (ViewGroup)inflater.inflate(R.layout.fragment_recharge, container, false);
        Button button=(Button)view.findViewById(R.id.btn_rechage);

        android.support.v4.app.FragmentManager FM = getFragmentManager();
        android.support.v4.app.FragmentTransaction FT = FM.beginTransaction();

        FragmentCompany fragmentCompany = new FragmentCompany();
        FT.replace(R.id.fragments, fragmentCompany);
        FT.commit();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager FM = getFragmentManager();
                android.support.v4.app.FragmentTransaction FT = FM.beginTransaction();

                KeyboardFragment keyboardFragment = new KeyboardFragment();
                FT.replace(R.id.fragments, keyboardFragment);
                FT.commit();

            }
        });
        return view;

    }



}
