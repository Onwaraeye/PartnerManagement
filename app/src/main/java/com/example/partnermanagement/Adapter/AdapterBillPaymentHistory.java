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

public class AdapterBillPaymentHistory extends RecyclerView.Adapter<AdapterBillPaymentHistory.AdapterBillPaymentHistoryHolder> {

    private Context mContext;
    List<PosUser> posUsers;

    public AdapterBillPaymentHistory(Context mContext, List<PosUser> posUsers) {
        this.mContext = mContext;
        this.posUsers = posUsers;
    }

    @NonNull
    @Override
    public AdapterBillPaymentHistory.AdapterBillPaymentHistoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_bill,parent,false);
        return new AdapterBillPaymentHistoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBillPaymentHistory.AdapterBillPaymentHistoryHolder holder, int position) {
        try {

            String timestamp = posUsers.get(position).getCustomerID();

            holder.text_bill_number.setText(timestamp);

        }catch (NullPointerException e){ }
    }

    @Override
    public int getItemCount() {
        return posUsers.size();
    }

    public class AdapterBillPaymentHistoryHolder extends RecyclerView.ViewHolder {

        TextView text_bill_number;

        public AdapterBillPaymentHistoryHolder(@NonNull View itemView) {
            super(itemView);

            text_bill_number = itemView.findViewById(R.id.text_bill_number);
        }
    }
}
