package com.example.partnermanagement.fragment_bottomnav;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.partnermanagement.Adapter.AdapterPosUser;
import com.example.partnermanagement.R;

public class WalletFragment extends Fragment {

    View view;

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

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_wallet, container, false);



    }
}