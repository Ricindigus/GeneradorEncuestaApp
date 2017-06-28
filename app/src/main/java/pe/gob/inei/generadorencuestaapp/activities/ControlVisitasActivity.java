package pe.gob.inei.generadorencuestaapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import pe.gob.inei.generadorencuestaapp.R;

public class ControlVisitasActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_visitas);
        showToolbar("CONTROL DE VISITAS",true);
    }

    public void showToolbar(String title, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_control_visitas);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
