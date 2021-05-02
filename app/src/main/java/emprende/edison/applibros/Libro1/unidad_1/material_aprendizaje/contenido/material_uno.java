package emprende.edison.applibros.Libro1.unidad_1.material_aprendizaje.contenido;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import emprende.edison.applibros.R;

public class material_uno extends AppCompatActivity {
Button detalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_uno);


        Toolbar toolbar = findViewById(R.id.my_toolbar);
         setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setNavigationOnClickListener(v -> { finish(); });

        detalle =(Button) findViewById(R.id.reglabtn);

        detalle.setOnClickListener(view -> {
            Uri uri = Uri.parse("https://google.com");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
    }
}