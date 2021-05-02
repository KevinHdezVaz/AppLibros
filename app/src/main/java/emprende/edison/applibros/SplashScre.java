package emprende.edison.applibros;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScre extends AppCompatActivity {

    ImageView imagen;
    TextView texto;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_scre);
        imagen = findViewById(R.id.chido);
        texto = findViewById(R.id.chacos);


        imagen.startAnimation(AnimationUtils.loadAnimation(this,R.anim.from_abajo));
        texto.startAnimation(AnimationUtils.loadAnimation(this,R.anim.from_arriba));
        //sonido en los botones
        mediaPlayer = MediaPlayer.create(this, R.raw.intro);
        mediaPlayer.start();

        new Handler().postDelayed(new Runnable(){
            public void run(){
                // Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación
                Intent intent = new Intent( SplashScre.this, MainActivity.class);
                startActivity(intent);
                finish();
            };
        }, 3000);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        mediaPlayer.stop();
        mediaPlayer.release();

    }
}