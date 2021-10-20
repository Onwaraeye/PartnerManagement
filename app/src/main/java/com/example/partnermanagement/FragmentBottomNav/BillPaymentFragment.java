package com.example.partnermanagement.FragmentBottomNav;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.partnermanagement.BillPaymentElectricity;
import com.example.partnermanagement.R;


public class BillPaymentFragment extends Fragment {

    private LinearLayout menu_water_bill,menu_electricity_bill;
    private View view;

    public BillPaymentFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        TextView tx_custom_view = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.action_bar_layout,null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,ActionBar.LayoutParams.MATCH_PARENT
                , Gravity.CENTER);
        tx_custom_view.setText("การชำระบิล");
        ((AppCompatActivity)getActivity()).getSupportActionBar().setCustomView(tx_custom_view,params);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_bill_payment, container, false);
        Context mContext = getActivity();

        menu_water_bill = view.findViewById(R.id.menu_water_bill);
        menu_water_bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        menu_electricity_bill = view.findViewById(R.id.menu_electricity_bill);
        menu_electricity_bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, BillPaymentElectricity.class);
                mContext.startActivity(intent);

            }
        });

        return view;
    }
}