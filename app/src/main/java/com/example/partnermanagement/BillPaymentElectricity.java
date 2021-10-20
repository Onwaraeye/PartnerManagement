package com.example.partnermanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.partnermanagement.FragmentBottomNav.BillElectricityDetailFragment;
import com.example.partnermanagement.FragmentBottomNav.BillPaymentHistoryFragment;
import com.google.android.material.tabs.TabLayout;

public class BillPaymentElectricity extends AppCompatActivity {
    private TabLayout tabLayout;
    ImageView arrow_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_payment_electricity);

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setId(1).setText("ทำรายการ"));
        tabLayout.addTab(tabLayout.newTab().setId(2).setText("ประวัติชำระบิล"));

        Fragment fragment = null;
        fragment = new BillElectricityDetailFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container2,fragment).commit();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                if(tabLayout.getSelectedTabPosition() == 0){
                    fragment = new BillElectricityDetailFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container2,fragment).commit();
                }else if(tabLayout.getSelectedTabPosition() == 1){
                    fragment = new BillPaymentHistoryFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container2,fragment).commit(); }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Fragment fragment = null;
                if(tabLayout.getSelectedTabPosition() == 0){
                    fragment = new BillElectricityDetailFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container2,fragment).commit();
                }else if(tabLayout.getSelectedTabPosition() == 1){
                    fragment = new BillPaymentHistoryFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container2,fragment).commit(); }
            }
        });

        arrow_back = findViewById(R.id.ic_arrow_back);
        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( getFragmentManager().getBackStackEntryCount() > 0)
                {
                    getFragmentManager().popBackStack();
                    return;
                }
                onBackPressed();
            }
        });
    }
}