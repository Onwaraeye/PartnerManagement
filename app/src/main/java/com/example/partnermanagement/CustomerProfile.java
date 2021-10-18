package com.example.partnermanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.partnermanagement.Adapter.AdapterListCustomer;
import com.example.partnermanagement.Model.PosUser;

import java.util.ArrayList;
import java.util.List;

public class CustomerProfile extends AppCompatActivity {

    RecyclerView list_acc_customer;
    AdapterListCustomer adapterListCustomer;
    ImageView arrow_back,percent;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_profile);
        mContext = getApplication();

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
        percent = findViewById(R.id.ic_percent);
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), CustomerProfileViewPercent.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplication().startActivity(intent);
            }
        });


        list_acc_customer = findViewById(R.id.list_acc_customer);
        List<PosUser> posUserList = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            PosUser posUser = new PosUser();
            posUser.setCustomerID(i+"");
            posUserList.add(posUser);
        }

        adapterListCustomer = new AdapterListCustomer(this, posUserList);
        list_acc_customer.setLayoutManager(new LinearLayoutManager(this));
        list_acc_customer.setAdapter(adapterListCustomer);
    }
}