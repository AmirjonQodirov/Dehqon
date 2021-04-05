package tj.mobile.dehqon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import tj.mobile.dehqon.buttons.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);
        if (isFirstRun) {
            startActivity(new Intent(MainActivity.this, OneTimeDialog.class));
        }

        BottomNavigationView bnv = findViewById(R.id.bottom_nav);
        bnv.setSelectedItemId(R.id.main);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.reports:
                        startActivity(new Intent(getApplicationContext(), Reports.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.info:
                        startActivity(new Intent(getApplicationContext(), Info.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.contact:
                        startActivity(new Intent(getApplicationContext(), Contacts.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.main:
                        return true;
                }
                return false;
            }
        });
    }

    public void btn_clicked(View view) {

        if(view.getId() == R.id.btn1){
            Intent intent = new Intent(MainActivity.this, Button1.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn2){
            Intent intent = new Intent(MainActivity.this, Button2.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.btn3){
            Intent intent = new Intent(MainActivity.this, Button3.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.btn4){
            Intent intent = new Intent(MainActivity.this, Button4.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.btn5){
            Intent intent = new Intent(MainActivity.this, Button5.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.btn6){
            Intent intent = new Intent(MainActivity.this, Button6.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.btn7){
            Intent intent = new Intent(MainActivity.this, Button7.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn8){
            Intent intent = new Intent(MainActivity.this, Button8.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn9){
            Intent intent = new Intent(MainActivity.this, Button9.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn10){
            Intent intent = new Intent(MainActivity.this, Button10.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn11){
            Intent intent = new Intent(MainActivity.this, Button11.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn12){
            Intent intent = new Intent(MainActivity.this, Button12.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn13){
            Intent intent = new Intent(MainActivity.this, Button13.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn14){
            Intent intent = new Intent(MainActivity.this, Button14.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btn15){
            Intent intent = new Intent(MainActivity.this, Button15.class);
            startActivity(intent);
        }
    }
}