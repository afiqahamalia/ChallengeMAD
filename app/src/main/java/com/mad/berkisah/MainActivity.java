package com.mad.berkisah;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends Activity{
    ImageView menu1;
    ImageView menu2;
    ImageView menu3;
    ImageButton klr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu1= findViewById(R.id.counterTV);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getApplicationContext(),CounterActivity.class);
                startActivity(h);
            }
        });
        menu2= findViewById(R.id.galleryKegiatan);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getApplicationContext(), Galeri.class);
                startActivity(h);
            }
        });
        menu3= findViewById(R.id.tentangSaya);
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getApplicationContext(), aboutme.class);
                startActivity(h);
            }
        });

    }
}