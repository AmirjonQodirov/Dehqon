package tj.mobile.dehqon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        BottomNavigationView bnv = findViewById(R.id.bottom_nav);
        bnv.setSelectedItemId(R.id.info);

        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
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