package com.example.foodisgr8.Modelo.TraerJson;

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
import com.example.foodisgr8.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json_sucursales extends AppCompatActivity {

    Button botonGET;
    TextView mostrarJSON;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traer_json_sucursales);


        //------------------------------------------------------------------------------------------
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.logo_foreground);
        actionBar.setTitle("Sucursales");
        //------------------------------------------------------------------------------------------

        botonGET = (Button) findViewById(R.id.botonHola);
        mostrarJSON = (TextView) findViewById(R.id.mostrarJSON);

        botonGET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lladoGET();
            }
        });
    }

    private void lladoGET() {
        String url = "https://g61fb640298abd1-foodisgr8.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/sucursales/sucursales";


        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray jsonArray = response.getJSONArray("items");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        mostrarJSON.setText(jsonObject.toString());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        requestQueue.add(jsonObjectRequest);

    }
}
