package pe.gob.inei.generadorencuestaapp.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import pe.gob.inei.generadorencuestaapp.R;
import pe.gob.inei.generadorencuestaapp.fragments.Prueba1Fragment;
import pe.gob.inei.generadorencuestaapp.fragments.Prueba2Fragment;

public class EncuestaActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("ENCUESTA NACIONAL ESPECIALIZADA DE VICTIMIZACION 2017");
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_encuesta);
        navigationView = (NavigationView)findViewById(R.id.navigation_view_encuesta);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                drawerLayout.closeDrawers();
                switch(item.getItemId()){
                    case R.id.opcion_1:
                        setFragment(0);
                        break;
                    case R.id.opcion_2:
                        setFragment(1);
                        break;
                    case R.id.opcion_3:
                        setFragment(2);
                        break;
                    case R.id.opcion_4:
                        setFragment(3);
                        break;
                }
                return false;
            }
        });
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        setFragment(0);
    }
    public void setFragment(int pos){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (pos){
            case 0:
                Prueba1Fragment prueba1Fragment = new Prueba1Fragment();
                fragmentTransaction.replace(R.id.container_encuesta, prueba1Fragment);
                break;
            case 1:
                Prueba2Fragment prueba2Fragment = new Prueba2Fragment();
                fragmentTransaction.replace(R.id.container_encuesta, prueba2Fragment);
                break;
            case 2:
                Prueba1Fragment pruebaFragment1 = new Prueba1Fragment();
                fragmentTransaction.replace(R.id.container_encuesta, pruebaFragment1);
                break;
            case 3:
                Prueba2Fragment pruebaFragment2 = new Prueba2Fragment();
                fragmentTransaction.replace(R.id.container_encuesta, pruebaFragment2);
                break;
        }
        fragmentTransaction.commit();
    }
}
