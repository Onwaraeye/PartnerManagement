package com.example.partnermanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.sagarkoli.chetanbottomnavigation.chetanBottomNavigation;

public class MainActivity extends AppCompatActivity {

    private static final int other = 1;
    private static final int home = 2;
    private static final int user = 3;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    chetanBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);

        bottomNavigation = findViewById(R.id.bottom_nav_bar);

        bottomNavigation.add(new chetanBottomNavigation.Model(other,R.drawable.other));
        bottomNavigation.add(new chetanBottomNavigation.Model(home,R.drawable.home));
        bottomNavigation.add(new chetanBottomNavigation.Model(user,R.drawable.user));

        bottomNavigation.setOnShowListener(new chetanBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(chetanBottomNavigation.Model item) {

                switch (item.getId()){
                    case other:
                        Intent intent = new Intent(getApplicationContext(),Other.class);
                        startActivity(intent);
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
        bottomNavigation.show(home,true);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}