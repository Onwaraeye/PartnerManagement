package com.example.partnermanagement.FragmentBottomNav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.partnermanagement.Adapter.AdapterBillPaymentHistory;
import com.example.partnermanagement.Adapter.AdapterPosUser;
import com.example.partnermanagement.Model.PosUser;
import com.example.partnermanagement.R;

import java.util.ArrayList;
import java.util.List;

public class BillPaymentHistoryFragment extends Fragment {

    RecyclerView list_bill_number;
    View view;
    AdapterBillPaymentHistory adapterBillPaymentHistory;

    public BillPaymentHistoryFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_bill_payment_history, container, false);

        list_bill_number = view.findViewById(R.id.list_bill_number);

        List<PosUser> posUserList = new ArrayList<>();

        for (int i = 0; i < 9; i++){
            PosUser posUser = new PosUser();
            posUser.setCustomerID(i+"");
            posUserList.add(posUser);
        }

        adapterBillPaymentHistory = new AdapterBillPaymentHistory(getActivity(), posUserList);
        list_bill_number.setLayoutManager(new LinearLayoutManager(getActivity()));
        list_bill_number.setAdapter(adapterBillPaymentHistory);

        return view;
    }
}