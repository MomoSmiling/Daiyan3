package com.daiyan.momoliu.daiyan.HomePage;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.daiyan.momoliu.daiyan.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MomentsFragment extends Fragment {


    public MomentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_moments, container, false);
        String[] items = {"moment1", "momnet2", "moment3","moment4", "momnet5", "moment6","moment7", "momnet8", "moment9"};

        ListView listview = (ListView)view.findViewById(R.id.momnentsList);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                items
        );

        listview.setAdapter(listViewAdapter);

        // Inflate the layout for this fragment
        return view;
    }

}
