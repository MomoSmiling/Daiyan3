package com.daiyan.momoliu.daiyan.Me;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daiyan.momoliu.daiyan.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BasicInfoFragment extends Fragment {


    public BasicInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_basic_info, container, false);


        // Inflate the layout for this fragment
        return view;
    }

}
