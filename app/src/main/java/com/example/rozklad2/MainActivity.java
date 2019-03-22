package com.example.rozklad2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activity GTV
        TextView gtvtextview = (TextView) findViewById(R.id.GTV);

        gtvtextview.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the txtview is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link }
                Intent gtvIntent = new Intent(MainActivity.this, gtv_activity.class);

                // Start the new activity
                startActivity(gtvIntent);
            }


       });
        //activity busik
        TextView busiktextview = (TextView) findViewById(R.id.busik);

        busiktextview.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the txtview is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link }
                Intent busikIntent = new Intent(MainActivity.this, busik_activity.class);

                // Start the new activity
                startActivity(busikIntent);
            }


        });

        TextView busiktextview2 = (TextView) findViewById(R.id.busikZkon);

        busiktextview2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the txtview is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link }
                Intent busikIntent2 = new Intent(MainActivity.this, KonToCzwaBusikActivity.class);

                // Start the new activity
                startActivity(busikIntent2);
            }


        });

        TextView gtvtextview2 = (TextView) findViewById(R.id.GTVZkon);

        gtvtextview2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the txtview is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link }
                Intent gtvIntent2 = new Intent(MainActivity.this, KonToCzwaGTVActivity.class);

                // Start the new activity
                startActivity(gtvIntent2);
            }


        });


    }
}
