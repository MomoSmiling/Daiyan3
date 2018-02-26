package com.daiyan.momoliu.daiyan.Me;


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
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);
        String[] items = {"我的袋盐", "我的盐包", "我的收藏","未发出的袋盐", "客服中心"};

        ListView listview = (ListView)view.findViewById(R.id.historyInUser);
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
