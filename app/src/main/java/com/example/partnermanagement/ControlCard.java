package com.example.partnermanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.partnermanagement.Adapter.AdapterControlCard;
import com.example.partnermanagement.Model.ControlCardModel;

import java.util.ArrayList;
import java.util.List;

public class ControlCard extends AppCompatActivity {

    RecyclerView list_control_unt,list_control_etl,list_control_bl,list_control_ltlc,
            list_control_grn,list_control_tmn;
    AdapterControlCard adapterControlActive;
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

        ControlCardModel card5k = new ControlCardModel("5k","active");
        ControlCardModel card10k = new ControlCardModel("10k","active");
        ControlCardModel card15k = new ControlCardModel("15k","active");
        ControlCardModel card20k = new ControlCardModel("20k","active");
        ControlCardModel card25k = new ControlCardModel("25k","active");
        ControlCardModel card30k = new ControlCardModel("30k","active");
        ControlCardModel card50k = new ControlCardModel("50k","active");
        ControlCardModel card100k = new ControlCardModel("100k","active");
        ControlCardModel card20 = new ControlCardModel("20","active");
        ControlCardModel card50 = new ControlCardModel("50","active");
        ControlCardModel card90 = new ControlCardModel("90","active");
        ControlCardModel card100 = new ControlCardModel("100","active");
        ControlCardModel card150 = new ControlCardModel("150","active");
        ControlCardModel card300 = new ControlCardModel("300","active");
        ControlCardModel card500 = new ControlCardModel("500","active");
        ControlCardModel card1000 = new ControlCardModel("1000","active");

        //********************************************
        list_control_unt = findViewById(R.id.list_control_active_unt);
        List<ControlCardModel> control_unt = new ArrayList<>();
        control_unt.add(card5k);
        control_unt.add(card10k);
        control_unt.add(card20k);
        control_unt.add(card50k);
        control_unt.add(card100k);

        LinearLayoutManager layoutManager_unt = new LinearLayoutManager(getApplication(), LinearLayoutManager.HORIZONTAL, false);
        adapterControlActive = new AdapterControlCard(getApplication(), control_unt);
        list_control_unt.setLayoutManager(layoutManager_unt);
        list_control_unt.setAdapter(adapterControlActive);

        //********************************************
        list_control_etl = findViewById(R.id.list_control_active_etl);
        List<ControlCardModel> control_etl = new ArrayList<>();
        control_etl.add(card5k);
        control_etl.add(card10k);
        control_etl.add(card15k);
        control_etl.add(card30k);
        control_etl.add(card50k);
        control_etl.add(card100k);

        LinearLayoutManager layoutManager_etl = new LinearLayoutManager(getApplication(), LinearLayoutManager.HORIZONTAL, false);
        adapterControlActive = new AdapterControlCard(getApplication(), control_etl);
        list_control_etl.setLayoutManager(layoutManager_etl);
        list_control_etl.setAdapter(adapterControlActive);


        //********************************************
        list_control_bl = findViewById(R.id.list_control_active_bl);
        List<ControlCardModel> control_bl = new ArrayList<>();
        control_bl.add(card5k);
        control_bl.add(card10k);
        control_bl.add(card20k);
        control_bl.add(card50k);
        control_bl.add(card100k);

        LinearLayoutManager layoutManager_bl = new LinearLayoutManager(getApplication(), LinearLayoutManager.HORIZONTAL, false);
        adapterControlActive = new AdapterControlCard(getApplication(), control_bl);
        list_control_bl.setLayoutManager(layoutManager_bl);
        list_control_bl.setAdapter(adapterControlActive);


        //********************************************
        list_control_ltlc = findViewById(R.id.list_control_active_lt);
        List<ControlCardModel> control_ltlc = new ArrayList<>();
        control_ltlc.add(card5k);
        control_ltlc.add(card10k);
        control_ltlc.add(card25k);
        control_ltlc.add(card50k);
        control_ltlc.add(card100k);

        LinearLayoutManager layoutManager_ltlc = new LinearLayoutManager(getApplication(), LinearLayoutManager.HORIZONTAL, false);
        adapterControlActive = new AdapterControlCard(getApplication(), control_ltlc);
        list_control_ltlc.setLayoutManager(layoutManager_ltlc);
        list_control_ltlc.setAdapter(adapterControlActive);



        //********************************************
        list_control_grn = findViewById(R.id.list_control_active_grn);
        List<ControlCardModel> control_grn = new ArrayList<>();
        control_grn.add(card20);
        control_grn.add(card50);
        control_grn.add(card100);
        control_grn.add(card300);
        control_grn.add(card500);
        control_grn.add(card1000);

        LinearLayoutManager layoutManager_grn = new LinearLayoutManager(getApplication(), LinearLayoutManager.HORIZONTAL, false);
        adapterControlActive = new AdapterControlCard(getApplication(), control_grn);
        list_control_grn.setLayoutManager(layoutManager_grn);
        list_control_grn.setAdapter(adapterControlActive);


        //********************************************
        list_control_tmn = findViewById(R.id.list_control_active_tmn);
        List<ControlCardModel> control_tmn = new ArrayList<>();
        control_tmn.add(card50);
        control_tmn.add(card90);
        control_tmn.add(card150);
        control_tmn.add(card300);
        control_tmn.add(card500);
        control_tmn.add(card1000);

        LinearLayoutManager layoutManager_tmn = new LinearLayoutManager(getApplication(), LinearLayoutManager.HORIZONTAL, false);
        adapterControlActive = new AdapterControlCard(getApplication(), control_tmn);
        list_control_tmn.setLayoutManager(layoutManager_tmn);
        list_control_tmn.setAdapter(adapterControlActive);
    }
}