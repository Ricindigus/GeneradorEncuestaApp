package pe.gob.inei.generadorencuestaapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pe.gob.inei.generadorencuestaapp.R;

public class ViviendaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivienda);
    }

    public void irAEncuesta(View view){
        Intent intent = new Intent(this, EncuestaActivity.class);
        startActivity(intent);
    }

    public void irAControlVisitas(View view){
        Intent intent = new Intent(this, ControlVisitasActivity.class);
        startActivity(intent);
    }
}
