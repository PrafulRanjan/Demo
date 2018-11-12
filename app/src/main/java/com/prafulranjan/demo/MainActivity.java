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
        int i = 200 + 200;

        int i2 = 300 + 300;

        int i3 = i + i2;


        String test = "branch01";

        System.out.println("i =" + i);
        System.out.println("i3 =" + i3);

        if (i<500){
            System.out.println("Less");
        }



    }
}
