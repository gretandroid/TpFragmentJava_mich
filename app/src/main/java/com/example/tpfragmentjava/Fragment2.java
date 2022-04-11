package com.example.tpfragmentjava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    public Fragment2() {}

    private TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2,
                container,
                false);
        textView = view.findViewById(R.id.frag2TextView);
        return view;
    }
    public void received(String name) {
        textView.setText(name);
    }
}


















