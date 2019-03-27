package com.example.rozklad2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class gtv_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gtv_activity);

        PhotoView photoView2 = (PhotoView) findViewById(R.id.photo_GTV_zCzwa);
        photoView2.setImageResource(R.drawable.gtv_crop);

    }
}
