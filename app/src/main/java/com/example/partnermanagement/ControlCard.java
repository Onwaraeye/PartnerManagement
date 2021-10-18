package com.example.partnermanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
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
    ImageView arrow_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_card);

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

        list_control_active = findViewById(R.id.list_control_active_unt);
        List<Unitel> unitels = new ArrayList<>();

        Unitel unt5k = new Unitel("5k","1");
        Unitel unt10k = new Unitel("10k","0");
        Unitel unt20k = new Unitel("20k","0");
        Unitel unt50k = new Unitel("50k","1");
        Unitel unt100k = new Unitel("100k","1");

        unitels.add(unt5k);
        unitels.add(unt10k);
        unitels.add(unt20k);
        unitels.add(unt50k);
        unitels.add(unt100k);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplication(), LinearLayoutManager.HORIZONTAL, false);
        adapterControlActive = new AdapterControlActive(getApplication(), unitels);
        list_control_active.setLayoutManager(layoutManager);
        list_control_active.setAdapter(adapterControlActive);


    }
}