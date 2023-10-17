package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class Map extends AppCompatActivity implements OnMapReadyCallback{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Button button = (Button) findViewById(R.id.btnback);
        Button button2 = (Button) findViewById(R.id.other);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOther();}});
    }

    public void openActivity2() {
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }

    public void openOther() {
        Intent intent = new Intent(this,Other.class);
        startActivity(intent);
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

    }
}