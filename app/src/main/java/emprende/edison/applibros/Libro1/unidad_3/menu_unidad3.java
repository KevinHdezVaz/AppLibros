package emprende.edison.applibros.Libro1.unidad_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import emprende.edison.applibros.Libro1.unidad_2.area_interacciones.area_interacciones2;
import emprende.edison.applibros.Libro1.unidad_2.material_aprendizaje.material_aprendizaje2;
import emprende.edison.applibros.Libro1.unidad_2.menu_unidad2;
import emprende.edison.applibros.Libro1.unidad_2.tarea_actividades.tarea_actividades2;
import emprende.edison.applibros.Libro1.unidad_3.area_interacciones.area_interacciones3;
import emprende.edison.applibros.Libro1.unidad_3.material_aprendizaje.matrial_aprendizaje3;
import emprende.edison.applibros.Libro1.unidad_3.tarea_actividades.tarea_actividades3;
import emprende.edison.applibros.R;

public class menu_unidad3 extends AppCompatActivity {
    ImageView imagen1,imagen2,imagen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_unidad3);


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
        imagen1.setOnClickListener(v -> startActivity(new Intent(menu_unidad3.this, matrial_aprendizaje3.class)));
        imagen2.setOnClickListener(v -> startActivity(new Intent(menu_unidad3.this, area_interacciones3.class)));
        imagen3.setOnClickListener(v -> startActivity(new Intent(menu_unidad3.this, tarea_actividades3.class)));

    }
}