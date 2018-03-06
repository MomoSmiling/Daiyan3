package com.daiyan.momoliu.daiyan.HomePage;


import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.daiyan.momoliu.daiyan.R;

import java.util.ArrayList;
import java.util.List;


public class MomentsFragment extends Fragment implements OnItemClickListener{

    String[] member_names;
    TypedArray profile_pics;
    String[] statues;
    String[] contactType;
    int i = 0;

    List<MomentItem> momentItems;
    ListView mylistview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_moments, container, false);

        momentItems = new ArrayList<MomentItem>();

        member_names = view.getResources().getStringArray(R.array.Member_names);

        profile_pics = view.getResources().obtainTypedArray(R.array.profile_pics);

        statues = view.getResources().getStringArray(R.array.statues);

        contactType = view.getResources().getStringArray(R.array.contactType);

        for (int i = 0; i < member_names.length; i++) {
            MomentItem item = new MomentItem(member_names[i],
                    profile_pics.getResourceId(i, -1), statues[i],
                    contactType[i]);
            momentItems.add(item);
        }

        mylistview = (ListView)view.findViewById(R.id.momnentsList);
        MomentsAdapter adapter = new MomentsAdapter(getActivity(), momentItems);
        mylistview.setAdapter(adapter);

        mylistview.setOnItemClickListener(this);

//
//
//
//        ArrayList pics = new ArrayList<Integer>();
//       // SimpleAdapter adapter = new SimpleAdapter(getActivity(), pics, R.layout.single_moment, from, to);
//       for(int i = 0; i < images.length; i++){
//           pics.add(images[i]);
//       }
//
//        ListView listview = (ListView)view.findViewById(R.id.momnentsList);
//        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
//                getActivity(),
//                android.R.layout.simple_list_item_1,
//                pics
//        );
//
//        listview.setAdapter(listViewAdapter);

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        //String member_name = momentItems.get(position).getMember_name();
        i++;
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                if(i == 1){
                    Toast.makeText(getActivity(), "Single",
                            Toast.LENGTH_SHORT).show();
                }else if(i == 2){
                    Toast.makeText(getActivity(), "Double",
                            Toast.LENGTH_SHORT).show();
                }

                i = 0;
            }
        }, 500);

    }
}
