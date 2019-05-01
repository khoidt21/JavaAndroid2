package com.example.prm391x_tourguide_khoidtfx01411;

import android.content.Intent;
import android.content.res.Resources;
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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class HotelFragment extends Fragment {

    ListView lst;

    // 8 item
    int imgid[] = {R.drawable.hotel,R.drawable.hotel,R.drawable.hotel,R.drawable.hotel,R.drawable.hotel,R.drawable.hotel,R.drawable.hotel,R.drawable.hotel};

   // int imgid = R.drawable.hotel;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Lib lib = new Lib();
        Resources res = getResources();
        String[] titleName = res.getStringArray(R.array.listNameHotel);
        String[] desc = res.getStringArray(R.array.listDescHotel);
        String title = getResources().getString(R.string.app_hotel);
        int color = getResources().getColor(R.color.colorWhite);
        lib.setTitle((AppCompatActivity)getActivity(),title,color);
        View view = inflater.inflate(R.layout.hotel_fragment, container, false);
        lst = (ListView) view.findViewById(R.id.listview);
        BaseAdapter customAdapter = new CustomAdapter(imgid,titleName,desc, container.getContext());
        lst.setAdapter(customAdapter);
        return view;
    }

}
