package com.example.partnermanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.partnermanagement.fragment_bottomnav.HomeFragment;
import com.example.partnermanagement.fragment_bottomnav.OtherFragment;
import com.example.partnermanagement.fragment_bottomnav.UserFragment;
import com.google.android.material.navigation.NavigationView;
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

        ///////////////toolbar
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        TextView tx_custom_view = (TextView) LayoutInflater.from(this).inflate(R.layout.action_bar_layout,null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,ActionBar.LayoutParams.MATCH_PARENT
        , Gravity.CENTER);
        tx_custom_view.setText("ระบบจัดการพาร์ทเนอร์");
        getSupportActionBar().setCustomView(tx_custom_view,params);


        /////////////////////bottomNav
        bottomNavigation = findViewById(R.id.bottom_nav_bar);
        bottomNavigation.add(new chetanBottomNavigation.Model(other,R.drawable.other));
        bottomNavigation.add(new chetanBottomNavigation.Model(home,R.drawable.home));
        bottomNavigation.add(new chetanBottomNavigation.Model(user,R.drawable.user));
        bottomNavigation.setOnShowListener(new chetanBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(chetanBottomNavigation.Model item) {
                Fragment fragment = null;
                switch (item.getId()){
                    case other:
                        fragment = new OtherFragment();
                        break;
                    case home:
                        fragment = new HomeFragment();
                        break;
                    case user:
                        fragment = new UserFragment();
                        break;
                    default:
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
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

                Fragment fragment = null;
                switch (item.getId()){
                    case other:
                        fragment = new OtherFragment();
                        break;
                    case home:
                        fragment = new HomeFragment();
                        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
                        TextView tx_custom_view = (TextView) LayoutInflater.from(getApplication()).inflate(R.layout.action_bar_layout,null);
                        ActionBar.LayoutParams params = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,ActionBar.LayoutParams.MATCH_PARENT
                                , Gravity.CENTER);
                        tx_custom_view.setText("ระบบจัดการพาร์ทเนอร์");
                        getSupportActionBar().setCustomView(tx_custom_view,params);
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        break;
                    case user:
                        fragment = new UserFragment();
                        break;
                    default:
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            }
        });
        bottomNavigation.show(home,true);


        /////////////////////drawer
        NavigationView navView = (NavigationView) findViewById(R.id.navView);
        Menu m = navView.getMenu();
        m.add(0, 1, 0,"Foo");
        m.add(0, 2, 0,"Bar");
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case 1:
                        Toast.makeText(getApplicationContext(), "Page1",
                                Toast.LENGTH_SHORT ).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Page2",
                                Toast.LENGTH_SHORT ).show();
                        break;
                }
                return false;
            }
        });
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ///////////////blank_menu
        getMenuInflater().inflate(R.menu.blank_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}