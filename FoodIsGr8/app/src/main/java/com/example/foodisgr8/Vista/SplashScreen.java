package com.example.foodisgr8.Vista;



import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodisgr8.Controlador.MainActivity;
import com.example.foodisgr8.R;


public class SplashScreen extends AppCompatActivity implements Runnable {
    private ProgressBar progressBar, progressBar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView logo = findViewById(R.id.imagen_inicial);
        logo.setImageDrawable(getResources().getDrawable(R.drawable.isgr8));
        new Thread(this).start();

        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                progressBar2.incrementProgressBy(20);
            }
        };
        for(int i=0; i<5; i++){
            new Handler().postDelayed(runnable,(i+1)*1000);
        }
    }


    @Override
    public void run()  {
        try {
            Thread.sleep(5000);
            Intent screenChange = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(screenChange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}