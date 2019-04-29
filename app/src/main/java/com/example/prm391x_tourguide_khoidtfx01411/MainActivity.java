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

public class MainActivity extends FragmentActivity {

    ImageView imgHotel;
    ImageView imgATM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnClickListener listener = new OnClickListener() {
            public void onClick(View view) {
                Fragment fragment = null;
                if(view == findViewById(R.id.imgHotel)){
                    fragment = new HotelFragment();
                } else if(view == findViewById(R.id.imgATM)) {
                    fragment = new ATMFragment();
                }
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.customFragment, fragment);
                transaction.commit();
            }
        };
        imgHotel = (ImageView) findViewById(R.id.imgHotel);
        imgHotel.setOnClickListener(listener);
        imgATM  = (ImageView)findViewById(R.id.imgATM);
        imgATM.setOnClickListener(listener);
    }
}
