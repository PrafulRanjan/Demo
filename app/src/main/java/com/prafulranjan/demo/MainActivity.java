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
        int i = 150 + 100;

        int i2 = 100 + 50;

        int i3 = i + i2;


        String test = "branch02";

        System.out.println("i =" + i);
        System.out.println("i3 =" + i3);

        if (i>100){
            System.out.println("High");
        }

    }
}
