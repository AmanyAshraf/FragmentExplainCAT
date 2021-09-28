package com.pactise.fragmentexplain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=getSupportFragmentManager();

        BlankFragment Headfragment=new BlankFragment(Parts.getHeads());
        fragmentManager.beginTransaction().add(R.id.Head_fr,Headfragment).commit();

        BlankFragment Bodyfragment=new BlankFragment(Parts.getBodies());
        fragmentManager.beginTransaction().add(R.id.body_fr,Bodyfragment).commit();

        BlankFragment Legsfragment=new BlankFragment(Parts.getLegs());
        fragmentManager.beginTransaction().add(R.id.leg_fr,Legsfragment).commit();
    }
}