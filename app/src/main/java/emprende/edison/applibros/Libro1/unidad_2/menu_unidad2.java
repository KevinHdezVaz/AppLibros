package emprende.edison.applibros.Libro1.unidad_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import emprende.edison.applibros.Libro1.unidad_1.area_interacciones.Area_interacciones1;
import emprende.edison.applibros.Libro1.unidad_1.material_aprendizaje.material_aprendizaje;
import emprende.edison.applibros.Libro1.unidad_1.menu_unidad1;
import emprende.edison.applibros.Libro1.unidad_1.tarea_actividades.tarea_actividades1;
import emprende.edison.applibros.Libro1.unidad_2.area_interacciones.area_interacciones2;
import emprende.edison.applibros.Libro1.unidad_2.material_aprendizaje.material_aprendizaje2;
import emprende.edison.applibros.Libro1.unidad_2.tarea_actividades.tarea_actividades2;
import emprende.edison.applibros.R;

public class menu_unidad2 extends AppCompatActivity {
    ImageView imagen1,imagen2,imagen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_unidad2);


        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        toolbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradiente));
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
        imagen1.setOnClickListener(v -> startActivity(new Intent(menu_unidad2.this, material_aprendizaje2.class)));
        imagen2.setOnClickListener(v -> startActivity(new Intent(menu_unidad2.this, area_interacciones2.class)));
        imagen3.setOnClickListener(v -> startActivity(new Intent(menu_unidad2.this, tarea_actividades2.class)));

    }
}