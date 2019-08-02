package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button frag1;
    Button frag2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
frag1 = (Button)findViewById(R.id.frag1);
frag2 = (Button)findViewById(R.id.frag2);




    }




   public void changeFragment(View view) {
        Fragment fragment;
        if (view == findViewById(R.id.frag1)) {

            fragment = new fragmentone();

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frag_place, fragment);
            ft.commit();
        }

        if (view == findViewById(R.id.frag2)) {
            fragment = new Fragmenttwo();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frag_place, fragment);
            ft.commit();
        }
    }
}