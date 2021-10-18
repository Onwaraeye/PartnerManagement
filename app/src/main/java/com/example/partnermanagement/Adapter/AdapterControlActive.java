package com.example.partnermanagement.Adapter;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.partnermanagement.CustomerProfile;
import com.example.partnermanagement.Model.PosUser;
import com.example.partnermanagement.Model.Unitel;
import com.example.partnermanagement.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterControlActive extends RecyclerView.Adapter<AdapterControlActive.AdapterControlActiveHolder> {

    private Context mContext;
    List<Unitel> unitels;

    public AdapterControlActive(Context mContext, List<Unitel> unitels) {
        this.mContext = mContext;
        this.unitels = unitels;
    }

    @NonNull
    @Override
    public AdapterControlActive.AdapterControlActiveHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_control_active,parent,false);
        return new AdapterControlActiveHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterControlActive.AdapterControlActiveHolder holder, int position) {


            String price = unitels.get(position).getPrice();
            String status = unitels.get(position).getStatus_actv();

            holder.text_price.setText(price);
            holder.text_status_unt.setText(status);

            holder.linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (status.equals("1")){
                        Toast.makeText(mContext,"active",Toast.LENGTH_SHORT).show();
                        holder.image_status.setColorFilter(Color.argb(1, 84, 231, 98));
                    }else if(status.equals("0")){
                        Toast.makeText(mContext,"inactive",Toast.LENGTH_SHORT).show();
                        holder.image_status.setColorFilter(Color.argb(1, 196, 196, 196));
                    }

                }
            });


    }

    @Override
    public int getItemCount() {
        return unitels.size();
    }

    public class AdapterControlActiveHolder extends RecyclerView.ViewHolder{

        TextView text_price,text_status_unt;
        LinearLayout linearLayout;
        ImageView image_status;

        public AdapterControlActiveHolder(@NonNull View itemView) {
            super(itemView);

            text_price = itemView.findViewById(R.id.text_price);
            text_status_unt = itemView.findViewById(R.id.text_status_unt);
            linearLayout = itemView.findViewById(R.id.linearLayout);
            image_status = itemView.findViewById(R.id.image_status);
        }
    }
}
