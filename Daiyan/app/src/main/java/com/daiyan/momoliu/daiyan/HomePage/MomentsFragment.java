package com.daiyan.momoliu.daiyan.HomePage;


import android.content.Intent;
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

import com.daiyan.momoliu.daiyan.HomePage.MomentContent.MomentContentActivity;
import com.daiyan.momoliu.daiyan.R;

import java.util.ArrayList;
import java.util.List;


public class MomentsFragment extends Fragment implements OnItemClickListener{

    TypedArray profile_pics;
    String[] contactType;
    int i = 0;

    List<MomentItem> momentItems;
    ListView mylistview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_moments, container, false);

        momentItems = new ArrayList<MomentItem>();

        profile_pics = view.getResources().obtainTypedArray(R.array.profile_pics);


        contactType = view.getResources().getStringArray(R.array.contactType);

        for (int i = 0; i < contactType.length; i++) {
            MomentItem item = new MomentItem(
                    profile_pics.getResourceId(i, -1),
                    contactType[i]);
            momentItems.add(item);
        }

        mylistview = (ListView)view.findViewById(R.id.momnentsList);
        MomentsAdapter adapter = new MomentsAdapter(getActivity(), momentItems);
        mylistview.setAdapter(adapter);

        mylistview.setOnItemClickListener(this);

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        // get id of the selected moment and pass it to MomentContent Activity through intent
        // will fix in the future

        // String member_name = momentItems.get(position).getContactType();
        i++;
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                if(i == 1){
                    Toast.makeText(getActivity(), "Single",
                            Toast.LENGTH_SHORT).show();
                    Intent momentContent = new Intent(getActivity(), MomentContentActivity.class);
                    startActivity(momentContent);
                }else if(i == 2){
                    Toast.makeText(getActivity(), "Double",
                            Toast.LENGTH_SHORT).show();
                }

                i = 0;
            }
        }, 500);

    }
}
