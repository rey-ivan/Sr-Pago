package com.cobra.srpagopos.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cobra.srpagopos.R;

/**
 * Created by JoseEduardo on 20/08/2015.
 */
public class FragmentCompany extends android.support.v4.app.Fragment {


    public FragmentCompany() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_company, container, false);
    }


}
