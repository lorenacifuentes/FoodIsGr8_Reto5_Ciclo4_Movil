package com.example.foodisgr8.Vista;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.foodisgr8.Controlador.MainActivity;
import com.example.foodisgr8.R;

public class Fragment_Favoritos extends Fragment {

    View v;
    ActionBar actionBar;
    Button back;
    Intent pasarPantalla;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__favoritos, container, false);
//------------------------------------------------------------------------------------------
        actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.logo_foreground);
        actionBar.setTitle("Favoritos");
//------------------------------------------------------------------------------------------
        back = (Button) v.findViewById(R.id.Botonvolver);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Has vuelto al Inicio", Toast.LENGTH_LONG).show();
                pasarPantalla = new Intent(getActivity().getApplicationContext(), MainActivity.class);

                startActivity(pasarPantalla);
            }
        });
        return v;
    }
}