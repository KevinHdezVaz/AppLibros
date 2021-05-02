package emprende.edison.applibros.Libro1.unidad_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import emprende.edison.applibros.Adaptadores.Adaptador;
import emprende.edison.applibros.Adaptadores.lista;
import emprende.edison.applibros.Libro1.unidad_4.area_interacciones.area_interacciones4;
import emprende.edison.applibros.Libro1.unidad_4.material_aprendizaje.matrial_aprendizaje4;
import emprende.edison.applibros.Libro1.unidad_4.menu_unidad4;
import emprende.edison.applibros.Libro1.unidad_4.tarea_actividades.tarea_actividades4;
import emprende.edison.applibros.Libro1.unidad_5.area_interacciones.area_interacciones5;
import emprende.edison.applibros.Libro1.unidad_5.material_aprendizaje.material_aprendizaje5;
import emprende.edison.applibros.Libro1.unidad_5.tarea_actividades.tarea_actividades5;
import emprende.edison.applibros.R;

public class menu_unidad5 extends AppCompatActivity {


    ImageView imagen1,imagen2,imagen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_unidad5);


        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        imagen1 = findViewById(R.id.animacion_1);
        imagen2 = findViewById(R.id.animacion_2);
        imagen3 = findViewById(R.id.animacion_3);
//CONTROLAR LAS ANIMACIONES DE LAS IMAGENES DEL MENU DE ACTIVIDADES


        imagen1.startAnimation(AnimationUtils.loadAnimation(this,R.anim.from_right_0));
        imagen2.startAnimation(AnimationUtils.loadAnimation(this,R.anim.from_left_advanced));
        imagen3.startAnimation(AnimationUtils.loadAnimation(this,R.anim.from_right_0));

        toolbar.setNavigationOnClickListener(v -> finish());
//PARA QUE AL DAR CLIC A LA IMAGEN  SE PASE A LA SIGUIENTE VENTANA
        imagen1.setOnClickListener(v -> startActivity(new Intent(menu_unidad5.this, material_aprendizaje5.class)));
        imagen2.setOnClickListener(v -> startActivity(new Intent(menu_unidad5.this, area_interacciones5.class)));
        imagen3.setOnClickListener(v -> startActivity(new Intent(menu_unidad5.this, tarea_actividades5.class)));

    }
}