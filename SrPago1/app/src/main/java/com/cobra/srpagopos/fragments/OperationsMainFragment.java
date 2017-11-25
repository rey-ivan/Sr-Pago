package com.cobra.srpagopos.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.cobra.srpagopos.LoginActivity;
import com.cobra.srpagopos.MainActivity;
import com.cobra.srpagopos.R;


public class OperationsMainFragment extends android.support.v4.app.Fragment {


    public OperationsMainFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup view= (ViewGroup)inflater.inflate(R.layout.fragment_main_operations, container, false);

        Button btn_retirement=(Button)view.findViewById(R.id.btn_cash);
        btn_retirement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"yes",Toast.LENGTH_LONG).show();
                reterement();

            }
        });
        return view;
    }
    private void reterement(){
        Intent intent = new Intent(getActivity(), RechargeFragment.class);
        getActivity().startActivity(intent);
    }





}
