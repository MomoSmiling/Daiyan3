package com.daiyan.momoliu.daiyan.Search;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.daiyan.momoliu.daiyan.Me.UserActivity;
import com.daiyan.momoliu.daiyan.Message.MessageActivity;
import com.daiyan.momoliu.daiyan.PostMomentsPage.PostMomentsActivity;
import com.daiyan.momoliu.daiyan.R;

public class SearchActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent homepage = new Intent(SearchActivity.this, MessageActivity.class);
                    startActivity(homepage);
                    return true;
                case R.id.navigation_search:
                    return true;
                case R.id.navigation_post_a_message:
                    Intent postMoments = new Intent(SearchActivity.this, PostMomentsActivity.class);
                    startActivity(postMoments);
                    return true;
                case R.id.navigation_message:
                    Intent message = new Intent(SearchActivity.this, SearchActivity.class);
                    startActivity(message);
                    return true;
                case R.id.navigation_user:
                    Intent user = new Intent(SearchActivity.this, UserActivity.class);
                    startActivity(user);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //nav bar
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
