package com.example.tpfragmentjava;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Fragment1.Communication {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Fragment1", "L'activité est créée'");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Fragment1", "L'activité a Starté'");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Fragment1", "L'activité a Résumé'");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Fragment1", "L'activité est onPause'");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Fragment1", "L'activité est stoppée'");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Fragment1", "L'activité est détruite'");
    }

    @Override
    public void send(String nom) {
        TextView textView = findViewById(R.id.textViewActivity);
        textView.setText(nom);
        Fragment2 fragment2 = (Fragment2) getSupportFragmentManager()
                .findFragmentById(R.id.fragment2);
        if (fragment2 != null)
            fragment2.received(nom);
    }
}