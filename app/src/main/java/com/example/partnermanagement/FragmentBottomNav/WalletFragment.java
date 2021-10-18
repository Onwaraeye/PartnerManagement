package com.example.partnermanagement.FragmentBottomNav;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.partnermanagement.ControlCard;
import com.example.partnermanagement.Dashglo;
import com.example.partnermanagement.R;

public class WalletFragment extends Fragment {

    View view;
    Button button_wallet_partner,button_trading_wallet;

    public WalletFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        TextView tx_custom_view = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.action_bar_layout,null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,ActionBar.LayoutParams.MATCH_PARENT
                , Gravity.CENTER);
        tx_custom_view.setText("กระเป๋าเงิน");
        ((AppCompatActivity)getActivity()).getSupportActionBar().setCustomView(tx_custom_view,params);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_wallet, container, false);

        button_wallet_partner = view.findViewById(R.id.button_wallet_partner);
        button_wallet_partner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Dashglo.class);
                getActivity().startActivity(intent);
            }
        });

        button_trading_wallet = view.findViewById(R.id.button_trading_wallet);
        button_trading_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ControlCard.class);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }
}