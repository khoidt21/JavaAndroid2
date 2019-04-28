package com.example.prm391x_tourguide_khoidtfx01411;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.content.Intent;

public class CustomFragment extends Fragment {
    ImageView imgHotel;
    ImageView imgATM;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.custom_fragment, container, false);
        imgHotel = view.findViewById(R.id.imgHotel);
        imgHotel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HotelFragment.class);
                startActivity(intent);
            }
        });
        imgATM = view.findViewById(R.id.imgATM);
        imgATM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ATMFragment.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
