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

public class TicketRechargeFragment extends android.support.v4.app.Fragment  {
    android.support.v4.app.Fragment someFragment;
    public TicketRechargeFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup view= (ViewGroup)inflater.inflate(R.layout.fragment_ticket_recharge, container, false);
        android.support.v4.app.FragmentManager FM = getFragmentManager();
        android.support.v4.app.FragmentTransaction FT = FM.beginTransaction();

        BranchFragment branchFragment = new BranchFragment();
        FT.replace(R.id.fragments_ticket, branchFragment);
        FT.commit();
        return view;

    }



}
