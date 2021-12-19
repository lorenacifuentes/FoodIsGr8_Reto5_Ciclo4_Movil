package com.example.foodisgr8.Vista;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodisgr8.Controlador.MainActivity;
import com.example.foodisgr8.R;

public class Fragment_Inicio extends Fragment {

    View v;
    private ActionBar actionBar;
    Button Boton1;
    TextView Texto1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__inicio, container, false);
        //------------------------------------------------------------------------------------------
        actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.logo_foreground);
        //------------------------------------------------------------------------------------------

        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.isgr8, getActivity().getTheme());

        ImageView Imagen1 = (ImageView) v.findViewById(R.id.imageView2);
        Imagen1.setImageDrawable(drawable);
        //------------------------------------------------------------------------------------------

        Boton1 = (Button) v.findViewById(R.id.Boton1);
        Boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "¡Bienvenido a nuestra tienda!, por favor escoge una de las opciones del menú", Toast.LENGTH_LONG).show();
            }
        });

        Texto1 = (TextView) v.findViewById(R.id.Texto1);
//--------------------------------------------------------------------------------------------------
        return v;
    }


}