package com.example.partnermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.sagarkoli.chetanbottomnavigation.chetanBottomNavigation;

public class Other extends AppCompatActivity {

    private static final int other = 1;
    private static final int home = 2;
    private static final int user = 3;

    chetanBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        bottomNavigation = findViewById(R.id.bottom_nav_bar);

        bottomNavigation.add(new chetanBottomNavigation.Model(other,R.drawable.other));
        bottomNavigation.add(new chetanBottomNavigation.Model(home,R.drawable.home));
        bottomNavigation.add(new chetanBottomNavigation.Model(user,R.drawable.user));

        bottomNavigation.setOnShowListener(new chetanBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(chetanBottomNavigation.Model item) {

                switch (item.getId()){

                    case home:
                        Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent2);
                        finish();
                        break;

                    case user:
                        Intent intent3 = new Intent(getApplicationContext(),User.class);
                        startActivity(intent3);
                        finish();
                        break;

                    default:

                        break;
                }

            }
        });
        bottomNavigation.setOnClickMenuListener(new chetanBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(chetanBottomNavigation.Model item) {

            }
        });
        bottomNavigation.setOnReselectListener(new chetanBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(chetanBottomNavigation.Model item) {

            }
        });
        bottomNavigation.show(other,true);
    }
}