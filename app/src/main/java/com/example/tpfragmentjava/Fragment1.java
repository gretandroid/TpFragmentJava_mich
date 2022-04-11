package com.example.tpfragmentjava;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Fragment1 extends Fragment {
    Activity activity;
    Communication communication = null;
    EditText eNom;
    public Fragment1() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        Button button = view.findViewById(R.id.button);
        eNom = view.findViewById(R.id.eNom);
        Log.d("Fragment1","View créée");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                communication.send(eNom.getText().toString());
                Toast.makeText(activity,"Melenchon",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment1","Fragment crée");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment1","Le Fragment a démarré");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment1","Le Fragment a résumé");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment1","Le Fragment a stoppé");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment1","Le Fragment a été détruit");
    }

    // Quand l'utilisateur quitte le fragment, c'est là que
    // l'on commit tous les changements qui doivent persister
    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment1","Le Fragment en pause");
    }

    // Le fragment qui est détruit après l'appel à cette méthode
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment1","La View est détruite ");
    }

    // L'instance du fragment est associé avec une instance d'activité.
    // Le fragment et l'activité ne sont pas complètements initialisés
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (Activity) context;
        if (activity instanceof Communication){
            communication = (Communication) activity;
        }
        Log.d("Fragment1","Le Fragment est attaché à l'activité");
    }
    interface Communication{
        public void send(String nom);
    }
}















