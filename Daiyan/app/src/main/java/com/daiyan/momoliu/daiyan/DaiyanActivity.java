package com.daiyan.momoliu.daiyan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.daiyan.momoliu.daiyan.HomePage.MomentsFragment;
import com.daiyan.momoliu.daiyan.Me.UserActivity;
import com.daiyan.momoliu.daiyan.PostMomentsPage.PostMomentsActivity;

public class DaiyanActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_message:
                    mTextMessage.setText(R.string.title_message);
                    return true;
                case R.id.navigation_post_a_message:
                    Intent postMoments = new Intent(DaiyanActivity.this, PostMomentsActivity.class);
                    startActivity(postMoments);
                    return true;
                case R.id.navigation_search:
                    mTextMessage.setText("找盐");
                    return true;
                case R.id.navigation_user:
                    Intent user = new Intent(DaiyanActivity.this, UserActivity.class);
                    startActivity(user);
                    return true;
            }
            return false;
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daiyan);


        MomentsFragment momentsFragment = new MomentsFragment();
        FragmentManager manager = getSupportFragmentManager();

        // bottom navigation bar
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void intentToUser(){

    }
}
