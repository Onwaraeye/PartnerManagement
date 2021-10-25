package com.example.partnermanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.partnermanagement.Adapter.AdapterProduct;
import com.example.partnermanagement.Model.PosUser;

import java.util.ArrayList;
import java.util.List;

public class CustomerProfileViewPercent extends AppCompatActivity {

    private RecyclerView list_product;
    private AdapterProduct adapterProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_profile_view_percent);

        ImageView arrow_back = findViewById(R.id.ic_arrow_back);
        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        list_product = findViewById(R.id.list_product);
        List<PosUser> posUserList = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            PosUser posUser = new PosUser();
            posUser.setCustomerID(i+"");
            posUserList.add(posUser);
        }

        adapterProduct = new AdapterProduct(this, posUserList);
        list_product.setLayoutManager(new LinearLayoutManager(this));
        list_product.setAdapter(adapterProduct);
    }
}