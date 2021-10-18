package com.example.partnermanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.partnermanagement.Adapter.AdapterListCustomer;
import com.example.partnermanagement.Model.PosUser;

import java.util.ArrayList;
import java.util.List;

public class Dashglo extends AppCompatActivity {

    private RecyclerView list_acc_customer;
    private AdapterListCustomer adapterListCustomer;
    private ImageView arrow_back;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashglo);

        mContext = getApplication();

        arrow_back = findViewById(R.id.ic_arrow_back);
        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        View layout_bg = findViewById(R.id.layout_bg);
        GradientDrawable gd = new GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM,
                new int[] {0xFF616261,0xFF131313});
        gd.setCornerRadius(10);
        layout_bg.setBackgroundDrawable(gd);

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