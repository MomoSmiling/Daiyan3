package com.daiyan.momoliu.daiyan.PostMomentsPage;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daiyan.momoliu.daiyan.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PostAMomentFragment extends Fragment {


    public PostAMomentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post_a_moment, container, false);
    }

}
