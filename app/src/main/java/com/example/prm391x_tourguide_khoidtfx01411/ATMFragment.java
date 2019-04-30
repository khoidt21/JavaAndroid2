package com.example.prm391x_tourguide_khoidtfx01411;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
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

public class ATMFragment extends Fragment {


    ListView lst;
    String titleName[] = {"ATM Hoàn Kiếm","ATM Đinh Tiên Hoàng","ATM Hội sở"};
    String desc[] = {"17 phố Lý Thường Kiệt, Phường Phan Chu Trinh, Quận Hoàn Kiếm, Hà Nội, Hà Nội, Việt Nam","7 Đinh Tiên Hoàng, Quận Hoàn Kiếm, Hà Nội","57 Lý Thường Kiệt, Quận Hoàn Kiếm, Hà Nội"};
    int imgid[] = {R.drawable.atm_machine,R.drawable.atm_machine,R.drawable.atm_machine};
    List<ItemView> items;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        setTitle("ATM");
        View view = inflater.inflate(R.layout.atm_fragment, container, false);

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
        // textView.setBackgroundColor(getResources().getColor(R.color.background));
        textView.setTextColor(getResources().getColor(R.color.colorWhite));
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setCustomView(textView);
    }
}
