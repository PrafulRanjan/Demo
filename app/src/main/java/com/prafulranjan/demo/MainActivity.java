package com.prafulranjan.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void testUpload() {
        int i = 10 + 10;

        String test = "hello";

        System.out.println("i =" + i);
    }
}
