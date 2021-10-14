package com.example.partnermanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.partnermanagement.Adapter.AdapterControlActive;
import com.example.partnermanagement.Adapter.AdapterPosUser;
import com.example.partnermanagement.Model.PosUser;
import com.example.partnermanagement.Model.Unitel;

import java.util.ArrayList;
import java.util.List;

public class ControlCard extends AppCompatActivity {

    RecyclerView list_control_active;
    AdapterControlActive adapterControlActive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_card);

        list_control_active = findViewById(R.id.list_control_active);
        List<Unitel> unitels = new ArrayList<>();
        Unitel unitel = new Unitel();

        Unitel unt5k = new Unitel("5k","active");
        Unitel unt10k = new Unitel("10k","active");
        Unitel unt20k = new Unitel("20k","active");
        Unitel unt50k = new Unitel("50k","active");
        Unitel unt100k = new Unitel("100k","active");


        unitels.add(unt5k);
        unitels.add(unt10k);
        unitels.add(unt20k);
        unitels.add(unt50k);
        unitels.add(unt100k);

        Log.e("unt",unitels.get(1).getPrice());

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getApplication(), LinearLayoutManager.HORIZONTAL, false);

        adapterControlActive = new AdapterControlActive(getApplication(), unitels);
        list_control_active.setLayoutManager(layoutManager);
        list_control_active.setAdapter(adapterControlActive);


    }
}