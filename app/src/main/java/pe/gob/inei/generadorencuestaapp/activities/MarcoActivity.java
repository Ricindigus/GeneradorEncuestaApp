package pe.gob.inei.generadorencuestaapp.activities;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import pe.gob.inei.generadorencuestaapp.R;
import pe.gob.inei.generadorencuestaapp.adapters.EncuestadoAdapter;
import pe.gob.inei.generadorencuestaapp.pojos.Encuestado;

public class MarcoActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EncuestadoAdapter encuestadoiAdapter;
    private ArrayList<Encuestado> encuestados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marco);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_encuestado);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        inicializarDatos();
        EncuestadoAdapter encuestadoAdapter= new EncuestadoAdapter(encuestados, new EncuestadoAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                final CardView rootView = (CardView) v;
                final TextView txtTextView1 = (TextView) rootView.findViewById(R.id.encuestado_numero);
                final TextView txtTextView2 = (TextView) rootView.findViewById(R.id.encuestado_campo1);
                final TextView txtTextView3 = (TextView) rootView.findViewById(R.id.encuestado_campo2);
                final TextView txtTextView4 = (TextView) rootView.findViewById(R.id.encuestado_campo3);
                int colorFrom = ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary);
                int colorTo = ContextCompat.getColor(getApplicationContext(), R.color.icons);

                int colorFrom2 = ContextCompat.getColor(getApplicationContext(), R.color.icons );
                int colorTo2 = ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary);

                ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), colorFrom, colorTo);
                colorAnimation.setDuration(800); // milliseconds
                colorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animator) {
                        rootView.setCardBackgroundColor((int) animator.getAnimatedValue());
                    }
                });
                colorAnimation.start();

                ValueAnimator colorAnimation2 = ValueAnimator.ofObject(new ArgbEvaluator(), colorFrom2, colorTo2);
                colorAnimation2.setDuration(800); // milliseconds
                colorAnimation2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animator) {
                        txtTextView1.setTextColor((int) animator.getAnimatedValue());
                        txtTextView2.setTextColor((int) animator.getAnimatedValue());
                        txtTextView3.setTextColor((int) animator.getAnimatedValue());
                        txtTextView4.setTextColor((int) animator.getAnimatedValue());
                    }
                });
                colorAnimation2.start();

                Intent intent = new Intent(getApplicationContext(), ViviendaActivity.class);
                intent.putExtra("numero",encuestados.get(position).getNumero());
                intent.putExtra("campo1", encuestados.get(position).getCampo1());
                intent.putExtra("campo2", encuestados.get(position).getCampo2());
                intent.putExtra("campo3", encuestados.get(position).getCampo3());
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(encuestadoAdapter);
    }
    private void inicializarDatos() {
        encuestados = new ArrayList<Encuestado>();
        encuestados.add(new Encuestado(1,"encuestado1_campo1","encuestado1_campo2","encuestado2_campo3"));
        encuestados.add(new Encuestado(2,"encuestado2_campo1","encuestado2_campo2","encuestado3_campo3"));
        encuestados.add(new Encuestado(3,"encuestado3_campo1","encuestado3_campo2","encuestado4_campo3"));
        encuestados.add(new Encuestado(4,"encuestado4_campo1","encuestado4_campo2","encuestado5_campo3"));
        encuestados.add(new Encuestado(5,"encuestado5_campo1","encuestado5_campo2","encuestado6_campo3"));
        encuestados.add(new Encuestado(6,"encuestado6_campo1","encuestado6_campo2","encuestado7_campo3"));
        encuestados.add(new Encuestado(7,"encuestado7_campo1","encuestado7_campo2","encuestado8_campo3"));
        encuestados.add(new Encuestado(8,"encuestado8_campo1","encuestado8_campo2","encuestado9_campo3"));
        encuestados.add(new Encuestado(9,"encuestado9_campo1","encuestado9_campo2","encuestado10_campo3"));
        encuestados.add(new Encuestado(10,"encuestado10_campo1","encuestado10_campo2","encuestado11_campo3"));
        encuestados.add(new Encuestado(11,"encuestado11_campo1","encuestado11_campo2","encuestado12_campo3"));
        encuestados.add(new Encuestado(12,"encuestado12_campo1","encuestado12_campo2","encuestado13_campo3"));
        encuestados.add(new Encuestado(13,"encuestado13_campo1","encuestado13_campo2","encuestado14_campo3"));
        encuestados.add(new Encuestado(14,"encuestado14_campo1","encuestado14_campo2","encuestado15_campo3"));
        encuestados.add(new Encuestado(15,"encuestado15_campo1","encuestado15_campo2","encuestado16_campo3"));
        encuestados.add(new Encuestado(16,"encuestado16_campo1","encuestado16_campo2","encuestado17_campo3"));
        encuestados.add(new Encuestado(17,"encuestado17_campo1","encuestado17_campo2","encuestado18_campo3"));
        encuestados.add(new Encuestado(18,"encuestado18_campo1","encuestado18_campo2","encuestado19_campo3"));
        encuestados.add(new Encuestado(19,"encuestado19_campo1","encuestado19_campo2","encuestado20_campo3"));
    }
}
