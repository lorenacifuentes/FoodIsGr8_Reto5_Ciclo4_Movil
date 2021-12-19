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

public class Fragment_Productos extends Fragment {

    View v;
    private ActionBar actionBar;
    Drawable drawable1, drawable2, drawable3, drawable4, drawable5, drawable6, drawable7 , drawable8;
    ImageView imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8;
    Button boton1,back;
    Intent pasarPantalla;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__productos, container, false);
//--------------------------------------------------------------------------------------------------

        actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.logo_foreground);
        actionBar.setTitle("Productos");

//--------------------------------------------------------------------------------------------------

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.hamburguesa_vacana, getActivity().getTheme());
        drawable2 = res1.getDrawable(R.drawable.hamburguesa_mexicana, getActivity().getTheme());
        drawable3 = res1.getDrawable(R.drawable.hamburguesa_artesanal, getActivity().getTheme());
        drawable4 = res1.getDrawable(R.drawable.pizza_pollotocineta, getActivity().getTheme());
        drawable5 = res1.getDrawable(R.drawable.pizza_carnes, getActivity().getTheme());
        drawable6 = res1.getDrawable(R.drawable.pizza_hawaiana, getActivity().getTheme());
        drawable7 = res1.getDrawable(R.drawable.super_perro, getActivity().getTheme());
        drawable8 = res1.getDrawable(R.drawable.perro_sencillo, getActivity().getTheme());


        imagen1 = (ImageView) v.findViewById(R.id.imageProd1);
        imagen1.setImageDrawable(drawable1);

        //------------------------------------------------------------------------------------------

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.hamburguesa_mexicana, getActivity().getTheme());

        imagen2 = (ImageView) v.findViewById(R.id.imageProd2);
        imagen2.setImageDrawable(drawable2);

        //------------------------------------------------------------------------------------------

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.hamburguesa_artesanal, getActivity().getTheme());

        imagen3 = (ImageView) v.findViewById(R.id.imageProd3);
        imagen3.setImageDrawable(drawable3);

        //------------------------------------------------------------------------------------------

        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.pizza_pollotocineta, getActivity().getTheme());

        imagen4 = (ImageView) v.findViewById(R.id.imageProd4);
        imagen4.setImageDrawable(drawable4);

        //------------------------------------------------------------------------------------------

        Resources res5 = getResources();
        drawable5 = res5.getDrawable(R.drawable.pizza_carnes, getActivity().getTheme());

        imagen5 = (ImageView) v.findViewById(R.id.imageProd5);
        imagen5.setImageDrawable(drawable5);

        //------------------------------------------------------------------------------------------

        Resources res6 = getResources();
        drawable6 = res6.getDrawable(R.drawable.pizza_hawaiana, getActivity().getTheme());

        imagen6 = (ImageView) v.findViewById(R.id.imageProd6);
        imagen6.setImageDrawable(drawable6);

        //------------------------------------------------------------------------------------------

        Resources res7 = getResources();
        drawable7 = res7.getDrawable(R.drawable.super_perro, getActivity().getTheme());

        imagen7 = (ImageView) v.findViewById(R.id.imageProd7);
        imagen7.setImageDrawable(drawable7);

        //------------------------------------------------------------------------------------------

        Resources res8 = getResources();
        drawable8 = res8.getDrawable(R.drawable.perro_sencillo, getActivity().getTheme());

        imagen8 = (ImageView) v.findViewById(R.id.imageProd8);
        imagen8.setImageDrawable(drawable8);

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