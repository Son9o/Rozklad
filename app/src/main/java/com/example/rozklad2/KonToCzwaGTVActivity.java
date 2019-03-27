package com.example.rozklad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class KonToCzwaGTVActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kon_to_czwa_gtv);


        PhotoView photoView3 = (PhotoView) findViewById(R.id.photo_GTV_zKon);
        photoView3.setImageResource(R.drawable.gtv_crop_z_kon);
    }
}
