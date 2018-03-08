package com.daiyan.momoliu.daiyan.Me;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

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
                    Intent homepage = new Intent(UserActivity.this, SearchActivity.class);
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        // nav bar
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
