package com.example.foodisgr8.Modelo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.foodisgr8.Modelo.TraerJson.Json_productos;
import com.example.foodisgr8.Modelo.TraerJson.Json_servicios;
import com.example.foodisgr8.Modelo.TraerJson.Json_sucursales;
import com.example.foodisgr8.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Oracle_Cloud extends AppCompatActivity {

    Button siguiente;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oracle_cloud);

        //------------------------------------------------------------------------------------------
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.logo_foreground);
        actionBar.setTitle("Oracle Cloud");
        //------------------------------------------------------------------------------------------

        siguiente = (Button) findViewById(R.id.botonProductos);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oracle_Cloud.this, Json_productos.class);
                startActivity(intent);
            }
        });

        siguiente = (Button) findViewById(R.id.botonServicios);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oracle_Cloud.this, Json_servicios.class);
                startActivity(intent);
            }
        });

        siguiente = (Button) findViewById(R.id.botonSucursales);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oracle_Cloud.this, Json_sucursales.class);
                startActivity(intent);
            }
        });
        }
}


