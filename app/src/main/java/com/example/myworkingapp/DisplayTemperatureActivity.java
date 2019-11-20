package com.example.myworkingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import android.os.Bundle;

public class DisplayTemperatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_temperature);

        Intent intent = getIntent(); //riceve la richiesta di intent dall'activity chiamante
        String temperature = intent.getStringExtra(TempConverter.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.show_temperature);
        textView.setText(temperature);
    }
}
