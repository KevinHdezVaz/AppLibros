package emprende.edison.applibros.Libro1.unidad_2.material_aprendizaje;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

import emprende.edison.applibros.Adaptadores.Adaptador;
import emprende.edison.applibros.Adaptadores.CustomAdapter;
import emprende.edison.applibros.Adaptadores.GridView_adapter;
import emprende.edison.applibros.Adaptadores.lista;
import emprende.edison.applibros.R;

public class material_aprendizaje2 extends AppCompatActivity {
    private ListView list;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_aprendizaje2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(v -> finish());

        list = (ListView) findViewById(R.id.item2_2);
        //EN ESTA PARTE SE COLOCAN LAS UNIDADES CON SU ICONO Y SU NOMBRE
        final ArrayList<lista> listItems = new ArrayList<>();
        listItems.add(new lista((R.drawable.libro), "Manejo de las principales cuentas contables"));
        listItems.add(new lista((R.drawable.libro),  "Cuentas de activo"));
        listItems.add(new lista((R.drawable.libro),  "La depreciación de los activos fijos"));
        listItems.add(new lista((R.drawable.libro),  "Pasivo y patrimonio"));
        listItems.add(new lista((R.drawable.libro),  "Cuentas de ingresos, costos y gastos"));
        listItems.add(new lista((R.drawable.libro),  "Balance general"));
        listItems.add(new lista((R.drawable.libro),  "Estado de pérdidas y ganancias"));
        listItems.add(new lista((R.drawable.libro),  "Ingresos tributables "));
        listItems.add(new lista((R.drawable.libro),  "TIC"));
        listItems.add(new lista((R.drawable.libro),  "Educación financiera"));
        listItems.add(new lista((R.drawable.libro),  "Evaluación sumativa"));

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

    }    }



