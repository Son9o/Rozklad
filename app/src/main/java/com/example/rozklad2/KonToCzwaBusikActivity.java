package com.example.rozklad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class KonToCzwaBusikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kon_to_czwa_busik);


        PhotoView photoView = (PhotoView) findViewById(R.id.photo_busik_zKon);
        photoView.setImageResource(R.drawable.busik_crop_z_kon);
    }
}
