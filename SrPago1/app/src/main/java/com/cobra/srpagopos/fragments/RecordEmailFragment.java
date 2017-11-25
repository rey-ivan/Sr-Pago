package com.cobra.srpagopos.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cobra.srpagopos.R;

public class RecordEmailFragment extends android.support.v4.app.Fragment  {
    android.support.v4.app.Fragment someFragment;
    public RecordEmailFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup view= (ViewGroup)inflater.inflate(R.layout.fragment_record_email, container, false);

        return view;

    }



}