package tj.mobile.dehqon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import es.dmoral.toasty.Toasty;

public class Reports extends AppCompatActivity {
    private static final int PERMISSION_REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);
        isReadStoragePermissionGranted();
        isWriteStoragePermissionGranted();

        BottomNavigationView bnv = findViewById(R.id.bottom_nav);
        bnv.setSelectedItemId(R.id.reports);

        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.reports:
                        return true;
                    case R.id.info:
                        startActivity(new Intent(getApplicationContext(), Info.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.contact:
                        startActivity(new Intent(getApplicationContext(), Contacts.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.main:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

    }

    public void rep_btn1(View view) {
        String value = DBHelper.TABLE_1;
        String[] table_rows = {
                DBHelper.TABLE_1_row1,
                DBHelper.TABLE_1_row2,
                DBHelper.TABLE_1_row3,
                DBHelper.TABLE_1_row4,
                DBHelper.TABLE_1_row5,
                DBHelper.TABLE_1_row6
        };

        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", value);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Корҳои_механикӣ.pdf");
        startActivity(i);
    }

    public void rep_btn2(View view) {
        String[] table_rows = {
                DBHelper.TABLE_2_row1,
                DBHelper.TABLE_2_row2,
                DBHelper.TABLE_2_row3,
                DBHelper.TABLE_2_row4,
                DBHelper.TABLE_2_row5,
                DBHelper.TABLE_2_row6
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_2);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Корҳои_дастӣ.pdf");
        startActivity(i);
    }

    public void rep_btn3(View view) {
        String[] table_rows = {
                DBHelper.TABLE_3_row1,
                DBHelper.TABLE_3_row2,
                DBHelper.TABLE_3_row3,
                DBHelper.TABLE_3_row4,
                DBHelper.TABLE_3_row5,
                DBHelper.TABLE_3_row6,
                DBHelper.TABLE_3_row7,
                DBHelper.TABLE_3_row8,
                DBHelper.TABLE_3_row9,
                DBHelper.TABLE_3_row10,
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_3);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Истифодабарии_нуриҳо.pdf");
        startActivity(i);
    }

    public void rep_btn4(View view) {
        String[] table_rows = {
                DBHelper.TABLE_4_row1,
                DBHelper.TABLE_4_row2,
                DBHelper.TABLE_4_row3,
                DBHelper.TABLE_4_row4,
                DBHelper.TABLE_4_row5,
                DBHelper.TABLE_4_row6,
                DBHelper.TABLE_4_row7,
                DBHelper.TABLE_4_row8,
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_4);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Обмонӣ.pdf");
        startActivity(i);
    }

    public void rep_btn5(View view) {
        String[] table_rows = {
                DBHelper.TABLE_5_row1,
                DBHelper.TABLE_5_row2,
                DBHelper.TABLE_5_row3,
                DBHelper.TABLE_5_row4,
                DBHelper.TABLE_5_row5,
                DBHelper.TABLE_5_row6,
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_5);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Муҳофизати_интегратсионнии_растанӣ.pdf");
        startActivity(i);
    }

    public void rep_btn6(View view) {
        String[] table_rows = {
                DBHelper.TABLE_6_row1,
                DBHelper.TABLE_6_row2,
                DBHelper.TABLE_6_row3,
                DBHelper.TABLE_6_row4,
                DBHelper.TABLE_6_row5,
                DBHelper.TABLE_6_row6,
                DBHelper.TABLE_6_row7,
                DBHelper.TABLE_6_row8,
                DBHelper.TABLE_6_row9,
                DBHelper.TABLE_6_row10,
                DBHelper.TABLE_6_row11,
                DBHelper.TABLE_6_row12,
                DBHelper.TABLE_6_row13,
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_6);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Истифодабарии_заҳрхимикатҳо.pdf");
        startActivity(i);
    }

    public void rep_btn7(View view) {
        String[] table_rows = {
                DBHelper.TABLE_7_row1,
                DBHelper.TABLE_7_row2,
                DBHelper.TABLE_7_row3,
                DBHelper.TABLE_7_row4,
                DBHelper.TABLE_7_row5,
                DBHelper.TABLE_7_row6,
                DBHelper.TABLE_7_row7,
                DBHelper.TABLE_7_row8,
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_7);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Ҷамъоварии_ҳосил.pdf");
        startActivity(i);
    }

    public void rep_btn8(View view) {
        String[] table_rows = {
                DBHelper.TABLE_8_row1,
                DBHelper.TABLE_8_row2,
                DBHelper.TABLE_8_row3,
                DBHelper.TABLE_8_row4,
                DBHelper.TABLE_8_row5,
                DBHelper.TABLE_8_row6,
                DBHelper.TABLE_8_row7,
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_8);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Корӽои_ислоӽотӣ.pdf");
        startActivity(i);
    }

    public void rep_btn9(View view) {
        String[] table_rows = {
                DBHelper.TABLE_9_row1,
                DBHelper.TABLE_9_row2,
                DBHelper.TABLE_9_row3,
                DBHelper.TABLE_9_row4,
                DBHelper.TABLE_9_row5,
                DBHelper.TABLE_9_row6,
                DBHelper.TABLE_9_row7,
                DBHelper.TABLE_9_row8
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_9);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Омӯзиши_коргарон.pdf");
        startActivity(i);
    }

    public void rep_btn10(View view) {
        String[] table_rows = {
                DBHelper.TABLE_10_row1,
                DBHelper.TABLE_10_row2,
                DBHelper.TABLE_10_row3,
                DBHelper.TABLE_10_row4,
                DBHelper.TABLE_10_row5,
                DBHelper.TABLE_10_row6,
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_10);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Арзу_шикоятҳо.pdf");
        startActivity(i);
    }

    public void rep_btn11(View view) {
        String[] table_rows = {
                DBHelper.TABLE_11_row1,
                DBHelper.TABLE_11_row2,
                DBHelper.TABLE_11_row3,
                DBHelper.TABLE_11_row4,
                DBHelper.TABLE_11_row5,
                DBHelper.TABLE_11_row6,
                DBHelper.TABLE_11_row7,
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_11);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Баргардонидани_маӽсулот.pdf");
        startActivity(i);
    }

    public void rep_btn12(View view) {
        String[] table_rows = {
                DBHelper.TABLE_12_row1,
                DBHelper.TABLE_12_row2,
                DBHelper.TABLE_12_row3,
                DBHelper.TABLE_12_row4,
                DBHelper.TABLE_12_row5,
                DBHelper.TABLE_12_row6,
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_12);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Ҳисоботи_нигоӽдории_заӽрхимикатӽо.pdf");
        startActivity(i);
    }

    public void rep_btn13(View view) {
        String[] table_rows = {
                DBHelper.TABLE_13_row1,
                DBHelper.TABLE_13_row2,
                DBHelper.TABLE_13_row3,
                DBHelper.TABLE_13_row4,
                DBHelper.TABLE_13_row5,
                DBHelper.TABLE_13_row6,
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_13);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Ҳисоботи_нигоӽдории_нуриӽо.pdf");
        startActivity(i);
    }

    public void rep_btn14(View view) {
        String[] table_rows = {
                DBHelper.TABLE_14_row1,
                DBHelper.TABLE_14_row2,
                DBHelper.TABLE_14_row3,
                DBHelper.TABLE_14_row4,
                DBHelper.TABLE_14_row5,
                DBHelper.TABLE_14_row6,
                DBHelper.TABLE_14_row7,
                DBHelper.TABLE_14_row8,
                DBHelper.TABLE_14_row9,
                DBHelper.TABLE_14_row10,
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_14);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Коркарди_маӽсулот.pdf");
        startActivity(i);
    }

    public void rep_btn15(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] table_rows = {
                DBHelper.TABLE_15_row1,
                DBHelper.TABLE_15_row2,
                DBHelper.TABLE_15_row3,
                DBHelper.TABLE_15_row4,
                DBHelper.TABLE_15_row5,
                DBHelper.TABLE_15_row6,
        };
        Intent i = new Intent(Reports.this, ViewTable.class);
        i.putExtra("table_name", DBHelper.TABLE_15);
        i.putExtra("table_rows", table_rows);
        i.putExtra("file_name", "Тозза_намудани_либоси_махсуси_муҳофизатӣ.pdf");
        startActivity(i);
    }

    public boolean isReadStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("permission", "Permission is granted1");
                return true;
            } else {

                Log.v("permission", "Permission is revoked1");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 3);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation
            Log.v("permission", "Permission is granted3");
            return true;
        }
    }

    public boolean isWriteStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("permission", "Permission is granted2");
                return true;
            } else {

                Log.v("permission", "Permission is revoked2");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation
            Log.v("permission", "Permission is granted3");
            return true;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Log.e("value", "Permission Granted, Now you can use local drive .");
                } else {
                    Log.e("value", "Permission Denied, You cannot use local drive .");
                }
                break;
        }
    }
}