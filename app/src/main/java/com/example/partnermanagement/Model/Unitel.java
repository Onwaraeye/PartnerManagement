package com.example.partnermanagement.Model;

import android.widget.EditText;

public class Unitel {

    private String status_actv;
    private String price;

    public Unitel(String price,String status_actv) {
        this.status_actv = status_actv;
        this.price = price;
    }

    public Unitel() {

    }

    public String getStatus_actv() {
        return status_actv;
    }

    public void setStatus_actv(String status_actv) {
        this.status_actv = status_actv;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
