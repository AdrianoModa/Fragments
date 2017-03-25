package com.example.androidc22.fragments;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fmanager = getSupportFragmentManager();
        FragmentTransaction fTransaction = fmanager.beginTransaction();

        int orientation = getWindowManager().getDefaultDisplay().getRotation();
        if(orientation == Configuration.ORIENTATION_PORTRAIT){

            Fragment f1 = new Fragment();
            fTransaction.replace(android.R.id.content, f1);
            Toast.makeText(this, "Fragment 1 em Ação", Toast.LENGTH_LONG);

        }else{

            Fragment f2 = new Fragment();
            fTransaction.replace(android.R.id.content, f2);
            Toast.makeText(this, "Fragment 2 em Ação", Toast.LENGTH_LONG);

        }
        fTransaction.commit();
    }
}
