package tj.mobile.dehqon.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;
import tj.mobile.dehqon.DBHelper;
import tj.mobile.dehqon.MainActivity;
import tj.mobile.dehqon.R;

public class Button8 extends AppCompatActivity {

    EditText row1, row2, row3, row4, row5, row7;
    String r1, r2, r3, r4, r5, r7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button8);
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

    public void fill_btn_8(View view) throws InterruptedException {
        row1 = findViewById(R.id.btn8_input_1);
        row2 = findViewById(R.id.btn8_input_2);
        row3 = findViewById(R.id.btn8_input_3);
        row4 = findViewById(R.id.btn8_input_4);
        row5 = findViewById(R.id.btn8_input_5);
        row7 = findViewById(R.id.btn8_input_7);

        r1 = row1.getText().toString();
        r2 = row2.getText().toString();
        r3 = row3.getText().toString();
        r4 = row4.getText().toString();
        r5 = row5.getText().toString();
        r7 = row7.getText().toString();

        DBHelper db = new DBHelper(this);

        if (r1.length() > 0 && r2.length() > 0 && r3.length() > 0 && r4.length() > 0 && r5.length() > 0
                 && r7.length() > 0) {
            SQLiteDatabase database = db.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(DBHelper.TABLE_8_row1, r1);
            contentValues.put(DBHelper.TABLE_8_row2, r2);
            contentValues.put(DBHelper.TABLE_8_row3, r3);
            contentValues.put(DBHelper.TABLE_8_row4, r4);
            contentValues.put(DBHelper.TABLE_8_row5, r5);
            contentValues.put(DBHelper.TABLE_8_row7, r7);

            database.insert(DBHelper.TABLE_8, null, contentValues);
            Toasty.success(Button8.this,
                    "Навишти шумо ба База дохил шуд",
                    Toast.LENGTH_SHORT, true).show();
            toMain();
        } else {
            Toasty.error(Button8.this,
                    "Илтимос ба ҳамаи саволҳо ҳатман ҷавоб диҳед",
                    Toast.LENGTH_SHORT, true).show();
        }
        Thread.sleep(10);
        db.close();
    }
    private void toMain() {
        Intent i = new Intent (Button8.this, MainActivity.class);
        startActivity(i);
        finish ();
    }

}