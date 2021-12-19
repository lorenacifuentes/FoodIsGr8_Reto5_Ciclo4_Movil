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
import android.widget.Toast;

import com.example.foodisgr8.Controlador.MainActivity;
import com.example.foodisgr8.R;

public class Fragment_Servicios extends Fragment {

    View v;
    private ActionBar actionBar;
    Drawable drawable1, drawable2, drawable3, drawable4;
    ImageView imagen1, imagen2, imagen3, imagen4;
    Button back;
    Intent pasarPantalla;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__servicios, container, false);
//------------------------------------------------------------------------------------------
        actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.logo_foreground);
        actionBar.setTitle("Servicios");

        //------------------------------------------------------------------------------------------

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.domicilio, getActivity().getTheme());

        imagen1 = (ImageView) v.findViewById(R.id.imageServ1);
        imagen1.setImageDrawable(drawable1);

        //------------------------------------------------------------------------------------------

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.horas, getActivity().getTheme());

        imagen2 = (ImageView) v.findViewById(R.id.imageServ2);
        imagen2.setImageDrawable(drawable2);

        //------------------------------------------------------------------------------------------

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.calendar, getActivity().getTheme());

        imagen3 = (ImageView) v.findViewById(R.id.imageServ3);
        imagen3.setImageDrawable(drawable3);

        //------------------------------------------------------------------------------------------

        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.atencion, getActivity().getTheme());

        imagen4 = (ImageView) v.findViewById(R.id.imageServ4);
        imagen4.setImageDrawable(drawable4);

        //------------------------------------------------------------------------------------------
        back = (Button) v.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Has vuelto al Inicio", Toast.LENGTH_LONG).show();
                pasarPantalla = new Intent(getActivity().getApplicationContext(), MainActivity.class);

                startActivity(pasarPantalla);
            }
        });
//------------------------------------------------------------------------------------------
        return v;
    }
}