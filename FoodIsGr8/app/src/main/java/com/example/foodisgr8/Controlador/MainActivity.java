package com.example.foodisgr8.Controlador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.foodisgr8.Modelo.Crud;
import com.example.foodisgr8.Modelo.Oracle_Cloud;
import com.example.foodisgr8.R;
import com.example.foodisgr8.Vista.Fragment_Favoritos;
import com.example.foodisgr8.Vista.Fragment_Inicio;
import com.example.foodisgr8.Vista.Fragment_Productos;
import com.example.foodisgr8.Vista.Fragment_Servicios;
import com.example.foodisgr8.Vista.Fragment_SobreNosotros;
import com.example.foodisgr8.Vista.Activity_Sucursales;

/**
 * Declaramos nuestra MainActivity y heredamos todas las características que tiene una
 * clase que es una Activity
 */
public class MainActivity extends AppCompatActivity {
    /**
     * Al declarar aquí el Action Bar nos permite poder modificar ciertas partes como
     * en este caso el ponerle el logo para que siempre esté presente
     */
    private ActionBar actionBar;
    /**
     * Declaración de nombres de cada una de los fragments para luego hacer su respectivo llamado
     * desde esta Actividad
     */
    Fragment subPantallaInicio, subPantallaProductos, subPantallaServicios, subPantallaFavoritos, subPantallaSobreNosotros;
    /**
     * Al declarar el FragmentTransaction nos permite realizar un cambio entre dos o más
     * fragments
     */
    FragmentTransaction intercambio;

    /**
     * Permite ejecutar el codigo por completo tanto de la clase padre OnCreate como
     * el codigo que hemos generado para esta parte del proyecto
     * @param savedInstanceState nos permite compilar nuestro código
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //------------------------------------------------------------------------------------------
        /**
         * Nos permite poder modificar en un fragment en específico la ActionBar
         */
        actionBar = getSupportActionBar();
        /**
         * Nos permite poder mostrar la barra de tareas
         */
        actionBar.setDisplayShowHomeEnabled(true);
        /**
         * Podemos incertar un logo en nustras ActionBar
         */
        actionBar.setIcon(R.mipmap.logo_foreground);

        //------------------------------------------------------------------------------------------
        /**
         * Nos permite ir al Fragment que tenemos declarado como inicio, donde encontramos el
         * la pantalla de inicio y el menú
         */
        subPantallaInicio = new Fragment_Inicio();
        /**
         * Nos permite ir al Fragment que tenemos declarado como productos, donde podemos
         * encontrar todos los productos que ofrece nuestra tienda
         */
        subPantallaProductos = new Fragment_Productos();
        /**
         * Nos permíte ir al Fragment que tenemos declarado como Servicios, donde podemos
         * encontrar los servicios que ofrece nuestra tienda como restaurante de comidas
         * rapidas
         */
        subPantallaServicios = new Fragment_Servicios();
        /**
         * Nos permite ir al Fragment que tenemos declarado como Favoritos, donde podemos
         * encontrar los productos que el cliente señale como favoritos
         */
        subPantallaFavoritos = new Fragment_Favoritos();
        /**
         * Nos permite ir al Fragment que tenemos declarado como Sobre nosotros, donde podemos
         * encontrar información sobre la empresa y una breve descripción
         */
        subPantallaSobreNosotros = new Fragment_SobreNosotros();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor_Fragments, subPantallaInicio).commit();

}
//-------------------------------------CREACION MENÚ------------------------------------------------

    /**
     *  Nos permite crear un menu para incertar las opciones que nos llevaran a todas las activities
     * @param menu nuestro menu
     * @return nos permite visualizarlo
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    /**
     *Son los items que se entucentran dentro de nuestro menú nos permite mostrar una u otra
     * activity cuando se clickean
     * @param item Opcion del meú para ir a una activity en especifico
     * @return la lista de nuestro menú además del boton que se encuentra dentro
     * de nuestra ToolBar
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.itemMenu){
            Toast.makeText(this,"¡Bienvenido/a al Módulo MENÚ!, conoce los productos que tenemos para ti", Toast.LENGTH_LONG).show();
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_Fragments, subPantallaProductos).commit();
        }
        if (id==R.id.itemServicios){
            Toast.makeText(this,"¡Bienvenido/a al Módulo SERVICIOS!, conoce los servicios que te ofrecemos", Toast.LENGTH_LONG).show();
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_Fragments, subPantallaServicios).commit();
        }
        if (id==R.id.itemUbicanos){
            Toast.makeText(this,"¡Bienvenido/a al Módulo SUCURSALES!, conoce nuestras sucursales", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, Activity_Sucursales.class);
            startActivity(intent);
            /*
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_Fragments, subPantallaSucursales).commit();*/
        }
        if (id==R.id.favorite){
            Toast.makeText(this,"¡Bienvenido/a al Módulo FAVORITOS!", Toast.LENGTH_LONG).show();
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_Fragments, subPantallaFavoritos).commit();
        }
        if (id==R.id.buscar){
            Toast.makeText(this,"¿Qué esperas para ver nuestro asombroso menú y encontrar lo que buscas?", Toast.LENGTH_LONG).show();
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_Fragments, subPantallaProductos).commit();
        }
        if (id==R.id.itemNosotros){
            Toast.makeText(this,"¡Bienvenido/a al Módulo SOBRE NOSOTROS!, conoce un poco de FoodIsGr8", Toast.LENGTH_LONG).show();
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_Fragments, subPantallaSobreNosotros).commit();
        }
        if (id==R.id.itemCrud){
            Toast.makeText(this,"¡Bienvenido/a al Módulo de CRUD!, realiza las peticiones del CRUD", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, Crud.class);
            startActivity(intent);
        }
        if (id==R.id.itemJson){
            Toast.makeText(this,"¡Bienvenido/a al Módulo de JSON Oracle Cloud!, aqui puedes mirar los JSON que arroja cada categoria", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, Oracle_Cloud.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
