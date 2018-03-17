package com.daiyan.momoliu.daiyan.Me;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.daiyan.momoliu.daiyan.DaiyanActivity;
import com.daiyan.momoliu.daiyan.Message.MessageActivity;
import com.daiyan.momoliu.daiyan.PostMomentsPage.PostMomentsActivity;
import com.daiyan.momoliu.daiyan.R;
import com.daiyan.momoliu.daiyan.Search.SearchActivity;

public class UserActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent homepage = new Intent(UserActivity.this, DaiyanActivity.class);
                    startActivity(homepage);
                    return true;
                case R.id.navigation_search:
                    Intent searchMoments = new Intent(UserActivity.this, SearchActivity.class);
                    startActivity(searchMoments);
                    return true;
                case R.id.navigation_post_a_message:
                    Intent postMoments = new Intent(UserActivity.this, PostMomentsActivity.class);
                    startActivity(postMoments);
                    return true;
                case R.id.navigation_message:
                    Intent message = new Intent(UserActivity.this, MessageActivity.class);
                    startActivity(message);
                    return true;
                case R.id.navigation_user:
                    return true;
            }
            return false;
        }

    };

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        mDrawerLayout = (DrawerLayout)findViewById(R.id.user);
//        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
//        mDrawerLayout.addDrawerListener(mToggle);
//        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


//        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        ActionBar actionbar = getSupportActionBar();
//        actionbar.setDisplayHomeAsUpEnabled(true);
//        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);
//
        NavigationView navigationView = (NavigationView)findViewById(R.id.nav_view);
        //..navigationView.setNavigationItemSelectedListener(UserActivity.this);

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });
//        mDrawerLayout.addDrawerListener(
//                new DrawerLayout.DrawerListener() {
//                    @Override
//                    public void onDrawerSlide(View drawerView, float slideOffset) {
//                        // Respond when the drawer's position changes
//                    }
//
//                    @Override
//                    public void onDrawerOpened(View drawerView) {
//                        // Respond when the drawer is opened
//                    }
//
//                    @Override
//                    public void onDrawerClosed(View drawerView) {
//                        // Respond when the drawer is closed
//                    }
//
//                    @Override
//                    public void onDrawerStateChanged(int newState) {
//                        // Respond when the drawer motion state changes
//                    }
//                }
//        );

        // nav bar
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        switch (id) {
            case R.id.wallet:
                Toast.makeText(this, "钱包", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.favorite:
                Toast.makeText(this, "收藏", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.draftMoments:
                Toast.makeText(this, "未发出的袋盐", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.feedback:
                Toast.makeText(this, "反馈", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }




}
