package com.example.foodisgr8.Vista;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodisgr8.R;

import org.osmdroid.config.Configuration;
import org.osmdroid.library.BuildConfig;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.ItemizedIconOverlay;
import org.osmdroid.views.overlay.ItemizedOverlayWithFocus;
import org.osmdroid.views.overlay.OverlayItem;

import java.util.ArrayList;

public class Activity_Sucursales extends AppCompatActivity {

    ArrayList<OverlayItem> puntos = new ArrayList<OverlayItem>();
    private MapView myOpenMapView;
    private MapController myMapController;
    private ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucursales);
        Configuration.getInstance().setUserAgentValue(BuildConfig.APPLICATION_ID);

        //------------------------------------------------------------------------------------------
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.logo_foreground);
        actionBar.setTitle("Sucursales");
        //------------------------------------------------------------------------------------------

        //  Puntos
        //------------------------------------------------------------------------------------------
        GeoPoint Bogota = new GeoPoint(4.719018, -74.035960);
        GeoPoint Bogota1 = new GeoPoint(4.639909, -74.141089);
        GeoPoint Bogota2 = new GeoPoint(4.719227, -74.072580);
        GeoPoint Bogota3 = new GeoPoint(4.547586, -74.093898);
        GeoPoint Bogota4 = new GeoPoint(4.642793, -74.090453);
        //------------------------------------------------------------------------------------------

        myOpenMapView = (MapView) findViewById(R.id.openmapview);
        myOpenMapView.setBuiltInZoomControls(true);

        myMapController = (MapController) myOpenMapView.getController();
        myMapController.setCenter(Bogota);
        myMapController.setZoom(13);

        myOpenMapView.setMultiTouchControls(true);
        puntos.add(new OverlayItem("Sucursal Cedritos", "Calle 140\n Tel: 456-8923", Bogota));
        puntos.add(new OverlayItem("Sucursal Castilla", "Carrera 78 #8a -33\n Tel: 795-8323", Bogota1));
        puntos.add(new OverlayItem("Sucursal Suba", "Carrera 59b Bis #128-89 Suba\n Tel: 578-8020", Bogota2));
        puntos.add(new OverlayItem("Sucursal San Cristobal Sur", "Calle 43A sur #3C -10, este\n Tel: 756-8321", Bogota3));
        puntos.add(new OverlayItem("Sucursal Teusaquillo", "Calle 44 #50-28\n Tel: 946-1115", Bogota4));
        refrescaPuntos();
    }

    //----------------------------------------------------------------------------------------------


    ItemizedIconOverlay.OnItemGestureListener<OverlayItem> tap = new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
        @Override
        public boolean onItemLongPress(int arg0, OverlayItem arg1) {
            return false;
        }
        @Override
        public boolean onItemSingleTapUp(int index, OverlayItem item) {
            return true;
        }
    };
    private void refrescaPuntos() {
        myOpenMapView.getOverlays().clear();
        ItemizedIconOverlay.OnItemGestureListener<OverlayItem> tap = new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
            @Override
            public boolean onItemLongPress(int arg0, OverlayItem arg1) {
                return false;
            }

            @Override
            public boolean onItemSingleTapUp(int index, OverlayItem item) {
                return true;
            }
        };

        ItemizedOverlayWithFocus<OverlayItem> capa = new ItemizedOverlayWithFocus<>(this, puntos, tap);
        capa.setFocusItemsOnTap(true);
        myOpenMapView.getOverlays().add(capa);
    }
}