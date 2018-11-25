package com.example.asus.nameandimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //Will be called when activity is first created.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle" , "onCreate is called");
    }

    //Will be called when activity is becoming visible to the user.
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle" , "onStart is called");
    }

    //Will be called when activity will start interacting with the user.
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle" , "onResume is called");
    }

    //Will be 	called when activity is not visible to the user.
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle" , "onPause is called");
    }

    //Will be called when activity is no longer visible to the user.
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle" , "onStop is called");
    }

    //Will be called before the activity is destroyed.
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle" , "onDestroy is called");
    }

    //Will be 	called after the activity is stopped, prior to start.
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle" , "onRestart is called");
    }
}

