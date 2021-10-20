package com.example.partnermanagement.FragmentBottomNav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.partnermanagement.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BillElectricityDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BillElectricityDetailFragment extends Fragment {

    public BillElectricityDetailFragment() {
    }
    public static BillElectricityDetailFragment newInstance(String param1, String param2) {
        BillElectricityDetailFragment fragment = new BillElectricityDetailFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bill_electricity_detail, container, false);
    }
}