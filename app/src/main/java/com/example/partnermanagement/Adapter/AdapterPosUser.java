package com.example.partnermanagement.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.partnermanagement.CustomerProfile;
import com.example.partnermanagement.Model.PosUser;
import com.example.partnermanagement.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterPosUser extends RecyclerView.Adapter<AdapterPosUser.AdapterPosUserHolder> {

    private Context mContext;
    List<PosUser> posUsers;

    public AdapterPosUser(Context mContext, List<PosUser> posUsers) {
        this.mContext = mContext;
        this.posUsers = posUsers;
    }

    @NonNull
    @Override
    public AdapterPosUser.AdapterPosUserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_pos_user,parent,false);
        return new AdapterPosUserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPosUser.AdapterPosUserHolder holder, int position) {
        try {

            String customerID = posUsers.get(position).getCustomerID();

            holder.text_customerID.setText(customerID);

            holder.linearLayout.setOnClickListener(view -> {
                Toast.makeText(mContext,customerID,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, CustomerProfile.class);
                mContext.startActivity(intent);
            });

        }catch (NullPointerException e){ }
    }

    @Override
    public int getItemCount() {
        return posUsers.size();
    }

    public class AdapterPosUserHolder extends RecyclerView.ViewHolder {

        TextView text_customerID;
        LinearLayout linearLayout;

        public AdapterPosUserHolder(@NonNull View itemView) {
            super(itemView);

            text_customerID = itemView.findViewById(R.id.text_customerID);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
