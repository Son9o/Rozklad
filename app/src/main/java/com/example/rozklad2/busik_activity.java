package com.example.rozklad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class busik_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busik_activity);

        PhotoView photoView = (PhotoView) findViewById(R.id.photo_busik_rozklad);
        photoView.setImageResource(R.drawable.busik_crop);


    }
}
