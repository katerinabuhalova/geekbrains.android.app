package com.example.geekbrainsandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_second);
        //setContentView(R.layout.activity_third);
    }

        public void switchLayout(View view) {
            setContentView(R.layout.activity_second);
        }

        public void switchLayout1(View view) {
            setContentView(R.layout.activity_third);
        }
}