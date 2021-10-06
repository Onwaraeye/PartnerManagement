package com.example.partnermanagement;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class PosFragment extends Fragment {



    public PosFragment() {

    }


    public static PosFragment newInstance(String param1, String param2) {
        PosFragment fragment = new PosFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        EditText tx_custom_view = (EditText) LayoutInflater.from(getContext()).inflate(R.layout.action_bar_search_layout,null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,ActionBar.LayoutParams.WRAP_CONTENT
                , Gravity.CENTER);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setCustomView(tx_custom_view,params);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pos, container, false);
    }
}