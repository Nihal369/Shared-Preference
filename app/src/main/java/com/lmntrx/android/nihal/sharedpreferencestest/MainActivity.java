package com.lmntrx.android.nihal.sharedpreferencestest;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create a sharePreferences object
        //1st argument is the unique package name
        //2nd is the mode,Usually private for access only to developer
        SharedPreferences myPreferences=this.getSharedPreferences("com.lmntrx.android.nihal.sharedpreferencestest",Context.MODE_PRIVATE);
        //Store a string,putInt for storing int
        myPreferences.edit().putString("userName","Nihal").apply();
        //Retrive data from sharedPreferences
        String userName=myPreferences.getString("userName"," ");
        Log.i("userName",userName);
        //To prove data is stored permanently comment out myPreferences.edit line
    }
}
