package tj.mobile.dehqon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);


        BottomNavigationView bnv = findViewById(R.id.bottom_nav);
        bnv.setSelectedItemId(R.id.contact);

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


    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void phone_contact(View view) {
        goToUrl("tel:+992927717168");
    }

    public void mail_contact(View view) {
        goToUrl("mailto:info@qmc.tj");
    }

    public void web_contact(View view) {
        goToUrl("http://qmc.tj");
    }
}