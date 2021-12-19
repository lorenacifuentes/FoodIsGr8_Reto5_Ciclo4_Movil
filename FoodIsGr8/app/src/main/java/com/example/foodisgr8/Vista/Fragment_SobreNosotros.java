package com.example.foodisgr8.Vista;

import androidx.appcompat.app.ActionBar;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.foodisgr8.Controlador.MainActivity;
import com.example.foodisgr8.R;

public class Fragment_SobreNosotros extends Fragment {
    View v;
    ActionBar actionBar;
    Drawable drawable1, drawable2, drawable3;
    ImageView imagen1, imagen2, imagen3;
    Button back;
    Intent pasarPantalla;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_sobrenosotros, container, false);

        actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.logo_foreground);
        actionBar.setTitle("Nosotros");

        //------------------------------------------------------------------------------------------

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.personal, getActivity().getTheme());
        drawable2 = res1.getDrawable(R.drawable.comidas, getActivity().getTheme());
        drawable3 = res1.getDrawable(R.drawable.local, getActivity().getTheme());

        imagen1 = (ImageView) v.findViewById(R.id.imageView3);
        imagen1.setImageDrawable(drawable1);

        //------------------------------------------------------------------------------------------

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.comidas, getActivity().getTheme());

        imagen2 = (ImageView) v.findViewById(R.id.imageView4);
        imagen2.setImageDrawable(drawable2);

        //------------------------------------------------------------------------------------------

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.local, getActivity().getTheme());

        imagen3 = (ImageView) v.findViewById(R.id.imageView5);
        imagen3.setImageDrawable(drawable3);

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