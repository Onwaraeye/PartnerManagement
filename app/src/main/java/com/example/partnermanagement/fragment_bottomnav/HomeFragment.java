package com.example.partnermanagement.fragment_bottomnav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.partnermanagement.PosFragment;
import com.example.partnermanagement.R;

public class HomeFragment extends Fragment {
    private LinearLayout menu_pos;
    private View view;
    public HomeFragment() {

    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
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
                        .replace(R.id.fragment_container, posFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}