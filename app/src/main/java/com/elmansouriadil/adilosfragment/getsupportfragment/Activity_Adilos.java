package com.elmansouriadil.adilosfragment.getsupportfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_Adilos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adilos);
        fragmentOne f1 = new fragmentOne();
        fragment_two f2 = new fragment_two();
        FragmentManager  FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.add(R.id.section1,f1,"F1");
        FT.add(R.id.section2,f2,"F2");
        FT.commit();
        //FT.add(R.id.parentLayout,f2,"F2");
        //FT.commit();  will throw an exception
    }
}
