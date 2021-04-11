package tj.mobile.dehqon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class OneTimeDialog extends AppCompatActivity {

    EditText farm_name, farm_owner, farm_area, farm_phone;
    String name, owner, phone, area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_time_dialog);
        findViewById(R.id.hide_keybd).setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                View focusedView = (View) getCurrentFocus();
                if (focusedView != null) {
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                }
                return true;
            }
        });
    }

    public void fill_constants(View view) {
        farm_name = findViewById(R.id.input_farm_name);
        farm_owner = findViewById(R.id.input_farm_owner);
        farm_area = findViewById(R.id.input_farm_area);
        farm_phone = findViewById(R.id.input_farm_phone);

        name = farm_name.getText().toString();
        owner = farm_owner.getText().toString();
        area = farm_area.getText().toString();
        area += "га";
        phone = farm_phone.getText().toString();

        Log.d("PDFCreator", "PDF Path: " + name);
        Log.d("PDFCreator", "PDF Path: " + owner);
        Log.d("PDFCreator", "PDF Path: " + area);
        Log.d("PDFCreator", "PDF Path: " + phone);


        if (name.length() > 0 && owner.length() > 0 && area.length() > 0 && phone.length() > 0){
            getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                    .putBoolean("isFirstRun", false).apply();
            getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().
                    putString("farm_name", name).apply();
            getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().
                    putString("farm_owner", owner).apply();
            getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().
                    putString("farm_area", area).apply();
            getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().
                    putString("farm_phone", phone).apply();
            Intent intent = new Intent(OneTimeDialog.this, MainActivity.class);
            startActivity(intent);
        }
        else{
            Toasty.error(OneTimeDialog.this,
                    "Бодиккат маълумотро дароред",
                    Toast.LENGTH_SHORT,true).show();
        }
    }
}