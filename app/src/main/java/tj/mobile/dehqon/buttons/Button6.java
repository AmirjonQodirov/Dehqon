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

public class Button6 extends AppCompatActivity {

    EditText row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, row11, row12, row13;
    String r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button6);
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

    public void fill_btn_6(View view) throws InterruptedException {
        row1 = findViewById(R.id.btn6_input_1);
        row2 = findViewById(R.id.btn6_input_2);
        row3 = findViewById(R.id.btn6_input_3);
        row4 = findViewById(R.id.btn6_input_4);
        row5 = findViewById(R.id.btn6_input_5);
        row6 = findViewById(R.id.btn6_input_6);
        row7 = findViewById(R.id.btn6_input_7);
        row8 = findViewById(R.id.btn6_input_8);
        row9 = findViewById(R.id.btn6_input_9);
        row10 = findViewById(R.id.btn6_input_10);
        row11 = findViewById(R.id.btn6_input_11);
        row12 = findViewById(R.id.btn6_input_12);
        row13 = findViewById(R.id.btn6_input_13);

        r1 = row1.getText().toString();
        r2 = row2.getText().toString();
        r3 = row3.getText().toString();
        r4 = row4.getText().toString();
        r5 = row5.getText().toString();
        r6 = row6.getText().toString();
        r7 = row7.getText().toString();
        r8 = row8.getText().toString();
        r9 = row9.getText().toString();
        r10 = row10.getText().toString();
        r11 = row11.getText().toString();
        r12 = row12.getText().toString();
        r13 = row13.getText().toString();

        DBHelper db = new DBHelper(this);

        if (r1.length() > 0 && r2.length() > 0 && r3.length() > 0 && r4.length() > 0 && r5.length() > 0
                && r6.length() > 0 && r7.length() > 0 && r8.length() > 0 && r9.length() > 0
                && r10.length() > 0 && r11.length() > 0 && r12.length() > 0 && r13.length() > 0
        ) {
            SQLiteDatabase database = db.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(DBHelper.TABLE_6_row1, r1);
            contentValues.put(DBHelper.TABLE_6_row2, r2);
            contentValues.put(DBHelper.TABLE_6_row3, r3);
            contentValues.put(DBHelper.TABLE_6_row4, r4);
            contentValues.put(DBHelper.TABLE_6_row5, r5);
            contentValues.put(DBHelper.TABLE_6_row6, r6);
            contentValues.put(DBHelper.TABLE_6_row7, r7);
            contentValues.put(DBHelper.TABLE_6_row8, r8);
            contentValues.put(DBHelper.TABLE_6_row9, r9);
            contentValues.put(DBHelper.TABLE_6_row10, r10);
            contentValues.put(DBHelper.TABLE_6_row11, r11);
            contentValues.put(DBHelper.TABLE_6_row12, r12);
            contentValues.put(DBHelper.TABLE_6_row13, r13);

            database.insert(DBHelper.TABLE_6, null, contentValues);
            Toasty.success(Button6.this,
                    "Навишти шумо ба База дохил шуд",
                    Toast.LENGTH_SHORT, true).show();
            toMain();
        } else {
            Toasty.error(Button6.this,
                    "Илтимос ба ҳамаи саволҳо ҳатман ҷавоб диҳед",
                    Toast.LENGTH_SHORT, true).show();
        }
        Thread.sleep(10);
        db.close();
    }
    private void toMain() {
        Intent i = new Intent (Button6.this, MainActivity.class);
        startActivity(i);
        finish ();
    }

}