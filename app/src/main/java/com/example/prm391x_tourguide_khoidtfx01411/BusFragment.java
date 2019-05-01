package com.example.prm391x_tourguide_khoidtfx01411;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class BusFragment extends Fragment {

    ListView lst;
    int[] imgid = {R.drawable.metro,R.drawable.metro,R.drawable.metro,R.drawable.metro,R.drawable.metro,
    R.drawable.metro,R.drawable.metro,R.drawable.metro,R.drawable.metro};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        Resources res = getResources();
        String[] titleName = res.getStringArray(R.array.listNameBus);
        String[] desc = res.getStringArray(R.array.listDescBus);
        Lib lib = new Lib();
        String title = getResources().getString(R.string.app_bus);
        View view = inflater.inflate(R.layout.bus_fragment, container, false);
        float textSize = getResources().getDimension(R.dimen.textSize);
        int color = getResources().getColor(R.color.colorWhite);
        lib.setTitle((AppCompatActivity)getActivity(),title,color,textSize);
        lst = (ListView) view.findViewById(R.id.listview);
        BaseAdapter customAdapter = new CustomAdapter(imgid,titleName,desc,container.getContext());
        lst.setAdapter(customAdapter);
        
        return view;
    }

}
