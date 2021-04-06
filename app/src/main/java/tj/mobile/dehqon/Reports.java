package tj.mobile.dehqon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

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
                switch (item.getItemId()){
                    case R.id.reports:
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
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }

    public void rep_btn1(View view) {

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] table_rows = {
                DBHelper.TABLE_1_row1,
                DBHelper.TABLE_1_row2,
                DBHelper.TABLE_1_row3,
                DBHelper.TABLE_1_row4,
                DBHelper.TABLE_1_row5,
                DBHelper.TABLE_1_row6
        };
        createPDF("1.pdf", DBHelper.TABLE_1,table_rows);

    }
    public void rep_btn2(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] table_rows = {
                DBHelper.TABLE_2_row1,
                DBHelper.TABLE_2_row2,
                DBHelper.TABLE_2_row3,
                DBHelper.TABLE_2_row4,
                DBHelper.TABLE_2_row5,
                DBHelper.TABLE_2_row6
        };
        createPDF("2.pdf", DBHelper.TABLE_2,table_rows);
    }
    public void rep_btn3(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        createPDF("3.pdf", DBHelper.TABLE_3,table_rows);
    }
    public void rep_btn4(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        createPDF("4.pdf", DBHelper.TABLE_4,table_rows);

    }
    public void rep_btn5(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] table_rows = {
                DBHelper.TABLE_5_row1,
                DBHelper.TABLE_5_row2,
                DBHelper.TABLE_5_row3,
                DBHelper.TABLE_5_row4,
                DBHelper.TABLE_5_row5,
                DBHelper.TABLE_5_row6,
        };
        createPDF("5.pdf", DBHelper.TABLE_5,table_rows);
    }
    public void rep_btn6(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        createPDF("6.pdf", DBHelper.TABLE_6,table_rows);
    }
    public void rep_btn7(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        createPDF("7.pdf", DBHelper.TABLE_7,table_rows);
    }
    public void rep_btn8(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] table_rows = {
                DBHelper.TABLE_8_row1,
                DBHelper.TABLE_8_row2,
                DBHelper.TABLE_8_row3,
                DBHelper.TABLE_8_row4,
                DBHelper.TABLE_8_row5,
                DBHelper.TABLE_8_row6,
                DBHelper.TABLE_8_row7,
        };
        createPDF("8.pdf", DBHelper.TABLE_8,table_rows);
    }
    public void rep_btn9(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        createPDF("9.pdf", DBHelper.TABLE_9,table_rows);
    }
    public void rep_btn10(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] table_rows = {
                DBHelper.TABLE_10_row1,
                DBHelper.TABLE_10_row2,
                DBHelper.TABLE_10_row3,
                DBHelper.TABLE_10_row4,
                DBHelper.TABLE_10_row5,
                DBHelper.TABLE_10_row6,
        };
        createPDF("10.pdf", DBHelper.TABLE_10,table_rows);
    }
    public void rep_btn11(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] table_rows = {
                DBHelper.TABLE_11_row1,
                DBHelper.TABLE_11_row2,
                DBHelper.TABLE_11_row3,
                DBHelper.TABLE_11_row4,
                DBHelper.TABLE_11_row5,
                DBHelper.TABLE_11_row6,
                DBHelper.TABLE_11_row7,
        };
        createPDF("11.pdf", DBHelper.TABLE_11,table_rows);
    }
    public void rep_btn12(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] table_rows = {
                DBHelper.TABLE_12_row1,
                DBHelper.TABLE_12_row2,
                DBHelper.TABLE_12_row3,
                DBHelper.TABLE_12_row4,
                DBHelper.TABLE_12_row5,
                DBHelper.TABLE_12_row6,
        };
        createPDF("12.pdf", DBHelper.TABLE_12,table_rows);
    }
    public void rep_btn13(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] table_rows = {
                DBHelper.TABLE_13_row1,
                DBHelper.TABLE_13_row2,
                DBHelper.TABLE_13_row3,
                DBHelper.TABLE_13_row4,
                DBHelper.TABLE_13_row5,
                DBHelper.TABLE_13_row6,
        };
        createPDF("13.pdf", DBHelper.TABLE_13,table_rows);
    }
    public void rep_btn14(View view) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        createPDF("14.pdf", DBHelper.TABLE_14,table_rows);
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
        createPDF("15.pdf", DBHelper.TABLE_15,table_rows);
    }


    public void createPDF(String file_name, String table_name, String[] table_rows) {

        Document doc = new Document();
        DBHelper db = new DBHelper(this);
        try {
            String path = "/storage/emulated/0/Download/Dehqon";
            File dir = new File(path);
            if(!dir.exists()){
                dir.mkdirs();
                dir.createNewFile();
            }

            File file = new File(dir, file_name);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();

            FileOutputStream fOut = new FileOutputStream(file);
            PdfWriter.getInstance(doc, fOut);

            BaseFont urName_bold = BaseFont.createFont("res/font/academy_tajik.TTF", "Cp1251",BaseFont.EMBEDDED);
            Font urFontName_bold = new Font(urName_bold);

            doc.open();
            Paragraph p1 = new Paragraph(table_name);
            p1.setFont(urFontName_bold);
            p1.setAlignment(Paragraph.ALIGN_CENTER);
            doc.add(p1);

            int length = table_rows.length;
            PdfPTable table = new PdfPTable(length);
            for (int i = 0; i < length; i++) {
                table.addCell(new PdfPCell(new Phrase(table_rows[i], urFontName_bold)));
            }

            SQLiteDatabase database = db.getWritableDatabase();
            Cursor cursor = database.query(table_name, null, null, null, null, null, null);
            if (cursor.moveToFirst()){
                do {
                    for (int i = 0; i < length; i++) {
                        table.addCell(new PdfPCell(new Phrase(cursor.getString(cursor.getColumnIndex(table_rows[i])), urFontName_bold)));
                    }
                } while (cursor.moveToNext());
            }
            cursor.close();
            doc.add((Element) table);
            Toasty.info(Reports.this, "Файли шумо дар папкаи Download/Dehqon сабт шуд", Toasty.LENGTH_LONG, true).show();

        } catch (DocumentException de) {
            Log.e("PDFCreator", "DocumentException:" + de);
        } catch (IOException e) {
            Log.e("PDFCreator", "ioException:" + e);
        } finally
        {
            doc.close();
            db.close();
        }
    }


    public  boolean isReadStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("permission","Permission is granted1");
                return true;
            } else {

                Log.v("permission","Permission is revoked1");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 3);
                return false;
            }
        }
        else { //permission is automatically granted on sdk<23 upon installation
            Log.v("permission","Permission is granted3");
            return true;
        }
    }

    public  boolean isWriteStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("permission","Permission is granted2");
                return true;
            } else {

                Log.v("permission","Permission is revoked2");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2);
                return false;
            }
        }
        else { //permission is automatically granted on sdk<23 upon installation
            Log.v("permission","Permission is granted3");
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