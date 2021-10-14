package com.example.partnermanagement.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.partnermanagement.Model.PosUser;
import com.example.partnermanagement.R;

import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.AdapterProductHolder> {

    private Context mContext;
    List<PosUser> posUsers;

    public AdapterProduct(Context mContext, List<PosUser> posUsers) {
        this.mContext = mContext;
        this.posUsers = posUsers;
    }

    @NonNull
    @Override
    public AdapterProduct.AdapterProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_product,parent,false);
        return new AdapterProductHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProduct.AdapterProductHolder holder, int position) {
        try {

            String product = posUsers.get(position).getCustomerID();

            holder.text_product.setText(product);

        }catch (NullPointerException e){ }
    }

    @Override
    public int getItemCount() {
        return posUsers.size();
    }

    public class AdapterProductHolder extends RecyclerView.ViewHolder {

        TextView text_product;

        public AdapterProductHolder(@NonNull View itemView) {
            super(itemView);

            text_product = itemView.findViewById(R.id.text_product);
        }
    }
}
