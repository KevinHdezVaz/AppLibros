package emprende.edison.applibros.Libro1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import emprende.edison.applibros.Adaptadores.Adaptador;
import emprende.edison.applibros.Adaptadores.lista;
import emprende.edison.applibros.Libro1.unidad_1.menu_unidad1;
import emprende.edison.applibros.Libro1.unidad_2.menu_unidad2;
import emprende.edison.applibros.Libro1.unidad_3.menu_unidad3;
import emprende.edison.applibros.Libro1.unidad_4.menu_unidad4;
import emprende.edison.applibros.Libro1.unidad_5.menu_unidad5;
import emprende.edison.applibros.Libro1.unidad_6.menu_unidad6;
import emprende.edison.applibros.R;

public class Libro1 extends AppCompatActivity {
    private ListView list;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro1);




Toolbar();

        list = (ListView) findViewById(R.id.item2_2);
//EN ESTA PARTE SE COLOCAN LAS UNIDADES CON SU ICONO Y SU NOMBRE
        final ArrayList<lista> listItems = new ArrayList<>();
        listItems.add(new lista((R.drawable.libros), "Unidad 1"));
        listItems.add(new lista((R.drawable.libros),  "Unidad 2"));
        listItems.add(new lista((R.drawable.libros),  "Unidad 3"));
        listItems.add(new lista((R.drawable.libros),  "Unidad 4"));
        listItems.add(new lista((R.drawable.libros),  "Unidad 5"));
        listItems.add(new lista((R.drawable.libros),  "Unidad 6"));
 //modulo de un vector


        adaptador = new Adaptador(this, listItems);
        list.setAdapter(adaptador);

        list.setOnItemClickListener((adapterView, view, i, l) -> {
            if (i == 0) {
                    startActivity(new Intent(Libro1.this, menu_unidad1.class));
            } else if (i == 1) {
                startActivity(new Intent(Libro1.this, menu_unidad2.class));

            } else if (i == 2) {
                startActivity(new Intent(Libro1.this, menu_unidad3.class));

            } else if (i == 3) {
                startActivity(new Intent(Libro1.this, menu_unidad4.class));

            } else if (i == 4) {
                startActivity(new Intent(Libro1.this, menu_unidad5.class));

            } else if (i == 5) {
                startActivity(new Intent(Libro1.this, menu_unidad6.class));

            }
        });

    }
public void Toolbar(){

    Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
    toolbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradiente));
    setSupportActionBar(toolbar);
    if (getSupportActionBar() != null) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //PARA QUE APAREZCA LA FLECHA DE ATRAS
    toolbar.setNavigationOnClickListener(v -> finish());
}
}
