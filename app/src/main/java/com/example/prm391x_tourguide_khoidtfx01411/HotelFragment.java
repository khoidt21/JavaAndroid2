package com.example.prm391x_tourguide_khoidtfx01411;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HotelFragment extends Fragment {

    ListView lst;
    String titleName[] = {"Khach san 1","Khach san 2","Khach san 3"};
    String desc[] = {"Mo ta 1","Mo ta 2","Mo ta 3"};
    Integer imgid[] = {R.drawable.ic_add,R.drawable.ic_add,R.drawable.ic_add};
    List<ItemView> items;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
       // getActivity().setTitle("Khách Sạn");
        //setTitle("Khách Sạn");

        View view = inflater.inflate(R.layout.hotel_fragment, container, false);
        items = new ArrayList<>();
        ItemView itemView;
        for (int i = 0; i < 10; i++) {
            itemView = new ItemView();
            itemView.setName("Item name"+ i);
            itemView.setDetail("Item detail"+i);
            items.add(itemView);
        }
        Log.d("AAA", items.size()+"");
        lst = (ListView) view.findViewById(R.id.listview);
        BaseAdapter customAdapter = new CustomAdapter(items, container.getContext());
        //CustomListView customListView = new CustomListView(this.getActivity(),titleName,desc,imgid);
        lst.setAdapter(customAdapter);
        //dung roi, anh chi tao ra may Entity ItemView roi add vao lít là xong

        return view;
    }
    /*public void setTitle(String title) {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView = new TextView(getActivity());
        textView.setText(title);
        textView.setTextSize(20);
        textView.setTypeface(null, Typeface.BOLD);
        textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(getResources().getColor(R.color.colorWhite));
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setCustomView(textView);
    }*/

}
