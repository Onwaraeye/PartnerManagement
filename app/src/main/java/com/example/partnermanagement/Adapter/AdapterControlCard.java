package com.example.partnermanagement.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.partnermanagement.Model.ControlCardModel;
import com.example.partnermanagement.R;

import java.util.List;

public class AdapterControlCard extends RecyclerView.Adapter<AdapterControlCard.AdapterControlCardHolder> {

    private Context mContext;
    List<ControlCardModel> controlCardModels;

    public AdapterControlCard(Context mContext, List<ControlCardModel> controlCardModels) {
        this.mContext = mContext;
        this.controlCardModels = controlCardModels;
    }

    @NonNull
    @Override
    public AdapterControlCard.AdapterControlCardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_control_active,parent,false);
        return new AdapterControlCardHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterControlCard.AdapterControlCardHolder holder, int position) {


            String price = controlCardModels.get(position).getPrice();
            String status = controlCardModels.get(position).getStatus_actv();

            holder.text_price.setText(price);
            holder.text_status_unt.setText(status);

            holder.linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (status.equals("1")){
                        Toast.makeText(mContext,"active",Toast.LENGTH_SHORT).show();
                    }
                }
            });


    }

    @Override
    public int getItemCount() {
        return controlCardModels.size();
    }

    public class AdapterControlCardHolder extends RecyclerView.ViewHolder{

        TextView text_price,text_status_unt;
        LinearLayout linearLayout;
        ImageView image_status;

        public AdapterControlCardHolder(@NonNull View itemView) {
            super(itemView);

            text_price = itemView.findViewById(R.id.text_price);
            text_status_unt = itemView.findViewById(R.id.text_status_unt);
            linearLayout = itemView.findViewById(R.id.linearLayout);
            image_status = itemView.findViewById(R.id.image_status);
        }
    }
}
