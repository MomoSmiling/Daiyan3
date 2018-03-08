package com.daiyan.momoliu.daiyan.Message;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.daiyan.momoliu.daiyan.Me.UserActivity;
import com.daiyan.momoliu.daiyan.PostMomentsPage.PostMomentsActivity;
import com.daiyan.momoliu.daiyan.R;
import com.daiyan.momoliu.daiyan.Search.SearchActivity;

public class MessageActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent homepage = new Intent(MessageActivity.this, MessageActivity.class);
                    startActivity(homepage);
                    return true;
                case R.id.navigation_search:
                    Intent searchMoments = new Intent(MessageActivity.this, SearchActivity.class);
                    startActivity(searchMoments);
                    return true;
                case R.id.navigation_post_a_message:
                    Intent postMoments = new Intent(MessageActivity.this, PostMomentsActivity.class);
                    startActivity(postMoments);
                    return true;
                case R.id.navigation_message:
                    return true;
                case R.id.navigation_user:
                    Intent user = new Intent(MessageActivity.this, UserActivity.class);
                    startActivity(user);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        //nav bar
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
