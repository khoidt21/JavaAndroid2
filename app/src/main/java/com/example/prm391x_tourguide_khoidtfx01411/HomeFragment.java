package com.example.prm391x_tourguide_khoidtfx01411;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.v4.app.FragmentTransaction;
import android.widget.ImageView;

public class HomeFragment extends Fragment implements View.OnClickListener {


    ImageView btnImgHotel;
    ImageView btnImgATM;
    ImageView btnImgHospital;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_container, container, false);
        btnImgHotel = (ImageView) view.findViewById(R.id.btnImgHotel);
        btnImgATM = (ImageView) view.findViewById(R.id.btnImgATM);
        btnImgHospital = (ImageView) view.findViewById(R.id.btnImgHospital);

        btnImgHotel.setOnClickListener(this);
        btnImgATM.setOnClickListener(this);
        btnImgHospital.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.btnImgHotel:
                fragment = new HotelFragment();
                replaceFragment(fragment);
                break;

            case R.id.btnImgATM:
                fragment = new ATMFragment();
                replaceFragment(fragment);
                break;
            case R.id.btnImgHospital:
                fragment = new HospitalFragment();
                replaceFragment(fragment);
                break;
                
        }
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.homeFragment, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}

