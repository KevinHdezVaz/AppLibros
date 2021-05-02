package emprende.edison.applibros.Libro1.unidad_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import emprende.edison.applibros.Adaptadores.Adaptador;
import emprende.edison.applibros.Adaptadores.lista;
import emprende.edison.applibros.R;

public class unidad2 extends AppCompatActivity {
    private ListView list;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidad2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        toolbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradiente));
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        toolbar.setNavigationOnClickListener(v -> finish());



        list = (ListView) findViewById(R.id.item2_2);
        //EN ESTA PARTE SE COLOCAN LAS UNIDADES CON SU ICONO Y SU NOMBRE
        final ArrayList<lista> listItems = new ArrayList<>();
        listItems.add(new lista((R.drawable.libro), "Normas tributarias para llevar contabilidad"));
        listItems.add(new lista((R.drawable.libro),  "El libro de ingresos y egresos"));
        listItems.add(new lista((R.drawable.libro),  "Concepto e importancia de la contabilidad"));
        listItems.add(new lista((R.drawable.libro),  "Principios contables básicos"));
        listItems.add(new lista((R.drawable.libro),  "Proceso contable: la partida doble"));
        listItems.add(new lista((R.drawable.libro),  "Clasificación de las cuentas"));
        listItems.add(new lista((R.drawable.libro),  "Activo, pasivo, patrimonio"));
        listItems.add(new lista((R.drawable.libro),  "Importancia de los impuestos"));
        listItems.add(new lista((R.drawable.libro),  "TIC"));
        listItems.add(new lista((R.drawable.libro),  "Educación financiera"));
        listItems.add(new lista((R.drawable.libro),  "Evaluación sumativa"));


        //modulo de un vector


        adaptador = new Adaptador(this, listItems);
        list.setAdapter(adaptador);

        list.setOnItemClickListener((adapterView, view, i, l) -> {
            if (i == 0) {

            } else if (i == 1) {

            } else if (i == 2) {

            } else if (i == 3) {

            } else if (i == 4) {

            } else if (i == 5) {

            } else if (i == 6) {

            }
            else if (i == 7) {
            }
        });

    }

}
