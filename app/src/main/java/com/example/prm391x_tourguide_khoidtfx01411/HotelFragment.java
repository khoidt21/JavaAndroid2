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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

public class HotelFragment extends Fragment {

    ListView lst;
    String titleName[] = {"The Queen Hotel & Spa","Hanoi Nostalgia Hotel & Spa","Church Legend Hotel Hanoi"};
    String desc[] = {"67 Thuốc Bắc, Hàng Bồ, Hàng Bồ, Quận Hoàn Kiếm, Hà Nội, Việt Nam","13-15 Luong Ngoc Quyen, Hang Buom, Hoan Kiem, Hàng Buồm, Quận Hoàn Kiếm, Hà Nội, Việt Nam","46 Ấu Triệu, Phường Hàng Trống, Quận Hoàn Kiếm, Hà Nội, Việt Nam"};
    int imgid[] = {R.drawable.hotel,R.drawable.hotel,R.drawable.hotel};
    List<ItemView> items;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        setTitle("Khách Sạn");

        View view = inflater.inflate(R.layout.hotel_fragment, container, false);
        items = new ArrayList<>();
        ItemView itemView;

        lst = (ListView) view.findViewById(R.id.listview);
        BaseAdapter customAdapter = new CustomAdapter(imgid,titleName,desc, container.getContext());
        lst.setAdapter(customAdapter);
        return view;
    }

    public void setTitle(String title) {
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
    }

}
