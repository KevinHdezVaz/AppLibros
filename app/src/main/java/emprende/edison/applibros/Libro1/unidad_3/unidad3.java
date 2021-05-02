package emprende.edison.applibros.Libro1.unidad_3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;

import androidx.appcompat.widget.Toolbar;

 import android.view.View;
 import android.widget.ListView;

import java.util.ArrayList;

import emprende.edison.applibros.Adaptadores.Adaptador;
import emprende.edison.applibros.Adaptadores.lista;
import emprende.edison.applibros.R;


public class unidad3 extends AppCompatActivity {
    private ListView list;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidad3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        toolbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradiente));
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //PARA QUE APAREZCA LA FLECHA DE ATRAS
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //regresar...
                finish();
            }
        });



        list = (ListView) findViewById(R.id.item2_2);
        //EN ESTA PARTE SE COLOCAN LAS UNIDADES CON SU ICONO Y SU NOMBRE
        final ArrayList<lista> listItems = new ArrayList<>();
        listItems.add(new lista((R.drawable.libro3), "Manejo de las principales cuentas contables"));
        listItems.add(new lista((R.drawable.libro3),  "Cuentas de activo"));
        listItems.add(new lista((R.drawable.libro3),  "La depreciación de los activos fijos"));
        listItems.add(new lista((R.drawable.libro3),  "Pasivo y patrimonio"));
        listItems.add(new lista((R.drawable.libro3),  "Cuentas de ingresos, costos y gastos"));
        listItems.add(new lista((R.drawable.libro3),  "Balance general"));
        listItems.add(new lista((R.drawable.libro3),  "Estado de pérdidas y ganancias"));
        listItems.add(new lista((R.drawable.libro3),  "Ingresos tributables "));
        listItems.add(new lista((R.drawable.libro3),  "TIC"));
        listItems.add(new lista((R.drawable.libro3),  "Educación financiera"));
        listItems.add(new lista((R.drawable.libro3),  "Evaluación sumativa"));


        //modulo de un vector


        adaptador = new Adaptador(this, listItems);
        list.setAdapter(adaptador);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
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
            }
        });

    }

    }