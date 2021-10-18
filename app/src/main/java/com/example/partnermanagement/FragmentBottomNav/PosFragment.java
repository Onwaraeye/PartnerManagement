package com.example.partnermanagement.FragmentBottomNav;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.partnermanagement.Adapter.AdapterPosUser;
import com.example.partnermanagement.Model.PosUser;
import com.example.partnermanagement.R;

import java.util.ArrayList;
import java.util.List;

public class PosFragment extends Fragment {

    RecyclerView list_pos_user;
    View view;
    AdapterPosUser adapterPosUser;

    public PosFragment() {

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
        view = inflater.inflate(R.layout.fragment_pos, container, false);

        list_pos_user = view.findViewById(R.id.list_pos_user);

        List<PosUser> posUserList = new ArrayList<>();

        for (int i = 0; i < 9; i++){
            PosUser posUser = new PosUser();
            posUser.setCustomerID(i+"");
            posUserList.add(posUser);
        }

        adapterPosUser = new AdapterPosUser(getActivity(), posUserList);
        list_pos_user.setLayoutManager(new LinearLayoutManager(getActivity()));
        list_pos_user.setAdapter(adapterPosUser);

        return view;
    }
}