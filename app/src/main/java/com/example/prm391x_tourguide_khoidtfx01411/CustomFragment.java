package com.example.prm391x_tourguide_khoidtfx01411;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CustomFragment extends FragmentActivity  {

    ImageView imgeHotel,imgeATM;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_fragment);
        OnClickListener listener = new OnClickListener() {
            public void onClick(View view) {
                Fragment fragment = null;
                if(view == findViewById(R.id.imgHotel)){
                    fragment = new HotelFragment();
                } else if(view == findViewById(R.id.imgATM)) {
                    fragment = new ATMFragment ();
                }
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.customFragment, fragment);
                transaction.commit();
            }
        };
        imgeHotel = (ImageView) findViewById(R.id.imgHotel);
        imgeHotel.setOnClickListener(listener);
        imgeATM = (ImageView) findViewById(R.id.imgATM);
        imgeHotel.setOnClickListener(listener);
    }

}
