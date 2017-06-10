package com.example.candy2.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowText(View view) {
        String msg ="เป็นคนน่ารัก";
        Toast toast =Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.show();
    }
}
