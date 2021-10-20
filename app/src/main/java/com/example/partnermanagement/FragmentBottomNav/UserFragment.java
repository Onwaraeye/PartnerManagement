package com.example.partnermanagement.FragmentBottomNav;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.partnermanagement.BillPaymentElectricity;
import com.example.partnermanagement.EditProfile;
import com.example.partnermanagement.LoginActivity;
import com.example.partnermanagement.R;
import com.example.partnermanagement.ReportSystemProblems;

public class UserFragment extends Fragment {

    private LinearLayout menu_edit_user,menu_report,menu_logout;
    private View view;
    private Context mContext;

    public UserFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_user, container, false);

        mContext = getActivity();

        menu_edit_user = view.findViewById(R.id.menu_edit_user);
        menu_edit_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, EditProfile.class);
                mContext.startActivity(intent);
            }
        });

        menu_report = view.findViewById(R.id.menu_report_system_problems);
        menu_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ReportSystemProblems.class);
                mContext.startActivity(intent);
            }
        });

        menu_logout = view.findViewById(R.id.menu_logout);
        menu_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getActivity().getSharedPreferences("checkbox",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("remember","false");
                editor.apply();
                Intent intent = new Intent(getActivity(),LoginActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        return view;
    }
}