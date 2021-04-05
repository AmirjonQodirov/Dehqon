package tj.mobile.dehqon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Info extends AppCompatActivity {
    TextView farm_name, farm_owner, farm_area, farm_phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);
        if (!isFirstRun) {
            farm_name = findViewById(R.id.farm_name);
            farm_name.setText(
                    getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                            .getString("farm_name", "NULL")
            );
            farm_owner = findViewById(R.id.farm_owner);
            farm_owner.setText(
                    getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                            .getString("farm_owner", "NULL")
            );
            farm_area = findViewById(R.id.farm_area);
            farm_area.setText(
                    getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                            .getString("farm_area", "NULL")
            );
            farm_phone = findViewById(R.id.farm_phone);
            farm_phone.setText(
                    getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                            .getString("farm_phone", "0")
            );
        }



        //navigation bar
        BottomNavigationView bnv = findViewById(R.id.bottom_nav);
        bnv.setSelectedItemId(R.id.info);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.reports:
                        startActivity(new Intent(getApplicationContext(), Reports.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.info:
                        return true;
                    case R.id.contact:
                        startActivity(new Intent(getApplicationContext(), Contacts.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.main:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

}