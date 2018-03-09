package com.daiyan.momoliu.daiyan.PostMomentsPage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.daiyan.momoliu.daiyan.DaiyanActivity;
import com.daiyan.momoliu.daiyan.Me.UserActivity;
import com.daiyan.momoliu.daiyan.Message.MessageActivity;
import com.daiyan.momoliu.daiyan.R;
import com.daiyan.momoliu.daiyan.Search.SearchActivity;

public class PostMomentsActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent homepage = new Intent(PostMomentsActivity.this, DaiyanActivity.class);
                    startActivity(homepage);
                    return true;
                case R.id.navigation_search:
                    Intent searchMoments = new Intent(PostMomentsActivity.this, SearchActivity.class);
                    startActivity(searchMoments);
                    return true;
                case R.id.navigation_post_a_message:
                    return true;
                case R.id.navigation_message:
                    Intent message = new Intent(PostMomentsActivity.this, MessageActivity.class);
                    startActivity(message);
                    return true;
                case R.id.navigation_user:
                    Intent user = new Intent(PostMomentsActivity.this, UserActivity.class);
                    startActivity(user);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_moments);

        //nav bar
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

}
