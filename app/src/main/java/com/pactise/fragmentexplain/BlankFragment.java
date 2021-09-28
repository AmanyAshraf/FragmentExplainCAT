package com.pactise.fragmentexplain;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
public class BlankFragment extends Fragment {
    private ArrayList <Integer> body =new ArrayList<>();
    private int index= 0;
    public BlankFragment(ArrayList <Integer> body) {
        this.body.addAll(body);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView =view.findViewById(R.id.iv);
        imageView.setImageResource(body.get(0));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < body.size()-1) index++;
                else index=0;
                imageView.setImageResource(body.get(index));
            }
        });
    }
}