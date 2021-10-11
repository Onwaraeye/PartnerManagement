package com.example.partnermanagement.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.partnermanagement.Model.PosUser;
import com.example.partnermanagement.R;

import java.util.List;

public class AdapterListCustomer extends RecyclerView.Adapter<AdapterListCustomer.AdapterListCustomerHolder> {

    private Context mContext;
    List<PosUser> posUsers;

    public AdapterListCustomer(Context mContext, List<PosUser> posUsers) {
        this.mContext = mContext;
        this.posUsers = posUsers;
    }

    @NonNull
    @Override
    public AdapterListCustomer.AdapterListCustomerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_accounts_customer,parent,false);
        return new AdapterListCustomerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListCustomer.AdapterListCustomerHolder holder, int position) {
        try {

            String timestamp = posUsers.get(position).getCustomerID();

            holder.text_timestamp.setText(timestamp);

        }catch (NullPointerException e){ }
    }

    @Override
    public int getItemCount() {
        return posUsers.size();
    }

    public class AdapterListCustomerHolder extends RecyclerView.ViewHolder {

        TextView text_timestamp;

        public AdapterListCustomerHolder(@NonNull View itemView) {
            super(itemView);

            text_timestamp = itemView.findViewById(R.id.text_timestamp);
        }
    }
}
