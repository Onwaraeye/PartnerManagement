package com.example.partnermanagement.fragment_bottomnav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.partnermanagement.R;

public class HomeFragment extends Fragment {
    private LinearLayout menu_pos,menu_wallet,menu_slip,menu_system;
    private View view;
    public HomeFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        menu_pos = view.findViewById(R.id.menu_pos);
        menu_pos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PosFragment posFragment= new PosFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, posFragment, "posFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        menu_wallet = view.findViewById(R.id.menu_wallet);
        menu_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WalletFragment walletFragment= new WalletFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, walletFragment, "walletFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}