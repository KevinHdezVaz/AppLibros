package emprende.edison.applibros;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import emprende.edison.applibros.Libro1.Libro1;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    NavigationView nav;
    MenuItem tools, home,home2 ;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    GridLayout mainGri;
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);



        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        toolbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradiente));
        setSupportActionBar(toolbar);

        nav=findViewById(R.id.nav_view);

        tools =  nav.getMenu().findItem(R.id.home);
        home2 =  nav.getMenu().findItem(R.id.nav_acerca);
        // Inflate the layout for this fragment
         mainGri = (GridLayout) findViewById(R.id.mainGrid);
        btn1 =   findViewById(R.id.btn_mate);
        btn2 = (ImageButton) findViewById(R.id.btn_quimica);
        btn3 = (ImageButton) findViewById(R.id.btn_calculo);





        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle=new
                ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);




        drawerLayout=findViewById(R.id.drawer_layout);

        btn1.setOnClickListener(view -> {
            //AL DAR CLIC AL PRIMER LIBRO TE DIRIGE A LAS UNIDADES DEL LIBRO 1
            Intent intent = new Intent(MainActivity.this, Libro1.class);
                startActivity(intent);
         });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //AL DAR CLIC AL SEGUNDO LIBRO TE DIRIGE A LAS UNIDADES DEL LIBRO 2


            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }


    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}