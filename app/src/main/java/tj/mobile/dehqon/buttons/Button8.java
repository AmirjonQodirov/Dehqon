package tj.mobile.dehqon.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;
import tj.mobile.dehqon.DBHelper;
import tj.mobile.dehqon.R;

public class Button8 extends AppCompatActivity {

    EditText row1, row2, row3, row4, row5, row6, row7;
    String r1, r2, r3, r4, r5, r6, r7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button8);
    }

    public void fill_btn_8(View view) throws InterruptedException {
        row1 = findViewById(R.id.btn8_input_1);
        row2 = findViewById(R.id.btn8_input_2);
        row3 = findViewById(R.id.btn8_input_3);
        row4 = findViewById(R.id.btn8_input_4);
        row5 = findViewById(R.id.btn8_input_5);
        row6 = findViewById(R.id.btn8_input_6);
        row7 = findViewById(R.id.btn8_input_7);

        r1 = row1.getText().toString();
        r2 = row2.getText().toString();
        r3 = row3.getText().toString();
        r4 = row4.getText().toString();
        r5 = row5.getText().toString();
        r6 = row6.getText().toString();
        r7 = row7.getText().toString();

        DBHelper db = new DBHelper(this);

        if (r1.length() > 0 && r2.length() > 0 && r3.length() > 0 && r4.length() > 0 && r5.length() > 0
                && r6.length() > 0 && r7.length() > 0) {
            SQLiteDatabase database = db.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(DBHelper.TABLE_8_row1, r1);
            contentValues.put(DBHelper.TABLE_8_row2, r2);
            contentValues.put(DBHelper.TABLE_8_row3, r3);
            contentValues.put(DBHelper.TABLE_8_row4, r4);
            contentValues.put(DBHelper.TABLE_8_row5, r5);
            contentValues.put(DBHelper.TABLE_8_row6, r6);
            contentValues.put(DBHelper.TABLE_8_row7, r7);

            database.insert(DBHelper.TABLE_8, null, contentValues);
            Toasty.success(Button8.this,
                    "Навишти шумо ба База дохил шуд",
                    Toast.LENGTH_SHORT, true).show();
        } else {
            Toasty.error(Button8.this,
                    "Илтимос ба ҳамаи саволҳо ҳатман ҷавоб диҳед",
                    Toast.LENGTH_SHORT, true).show();
        }
        Thread.sleep(10);
        db.close();
    }

}