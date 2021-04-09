package tj.mobile.dehqon;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

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

public class ViewTable extends AppCompatActivity {

    private static String farm_name, farm_owner, farm_area, farm_phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_table);
        String title = getIntent().getExtras().getString("file_name");
        setTitle(title);

        farm_name = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getString("farm_name", "NULL");

        farm_owner = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getString("farm_owner", "NULL");

        farm_area = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getString("farm_area", "NULL");

        farm_phone = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getString("farm_phone", "NULL");

        fillTable();
    }

    private void fillTable() {
        String[] table_rows = getIntent().getExtras().getStringArray("table_rows");
        String table_name = getIntent().getExtras().getString("table_name");
        TableLayout tl = (TableLayout) findViewById(R.id.tableInvoices);
        DBHelper db = new DBHelper(this);
        SQLiteDatabase database = db.getWritableDatabase();
        TableRow head = new TableRow(this);
        for (int i = 0 ; i < table_rows.length; i ++) {
            TextView text = new TextView(this);
            text.setText(table_rows[i]);
            text.setBackground(getResources().getDrawable(R.drawable.text_bord));
            head.addView(text);
        }
        head.setBackgroundResource(R.drawable.border_row_table);
        head.setLayoutParams(new TableLayout.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableLayout.LayoutParams.WRAP_CONTENT, 1.0f));
        tl.addView(head);

        Cursor cursor = database.query(true, table_name, table_rows, null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                TableRow tr = new TableRow(this);
                for (int i = 0; i < table_rows.length; i++) {
                    TextView text = new TextView(this);
                    text.setText(cursor.getString(cursor.getColumnIndex(table_rows[i])));
                    text.setBackground(getResources().getDrawable(R.drawable.text_bord));

                    tr.addView(text);
                }
                tr.setBackgroundResource(R.drawable.border_row_table);
                tl.addView(tr);
            } while (cursor.moveToNext());
        }

        cursor.close();
    }


    public void createPDF(String file_name, String table_name, String[] table_rows) {

        Document doc = new Document();
        DBHelper db = new DBHelper(this);
        try {
            String path = "/storage/emulated/0/Download/Dehqon";
            File dir = new File(path);
            if (!dir.exists()) {
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

            BaseFont urName_bold = BaseFont.createFont("res/font/academy_tajik.TTF", "Cp1251", BaseFont.EMBEDDED);
            Font urFontName_bold = new Font(urName_bold);

            doc.open();
            Paragraph p = new Paragraph();
            p.setFont(urFontName_bold);
            p.setAlignment(Element.ALIGN_CENTER);
            p.add(table_name);
            doc.add(p);

            p = new Paragraph();
            p.setFont(urFontName_bold);
            p.setAlignment(Element.ALIGN_CENTER);
            p.add("Номи хочагии дехкони: " + farm_name);
            doc.add(p);

            p = new Paragraph();
            p.setFont(urFontName_bold);
            p.setAlignment(Element.ALIGN_CENTER);
            p.add("Раиси хочагии дехкони: " + farm_owner);
            doc.add(p);


            p = new Paragraph();
            p.setFont(urFontName_bold);
            p.setAlignment(Element.ALIGN_CENTER);
            p.add("Масохати хочагии дехкони: " + farm_area);
            doc.add(p);

            p = new Paragraph();
            p.setFont(urFontName_bold);
            p.setAlignment(Element.ALIGN_CENTER);
            p.add("Раками телефон: " + farm_phone);
            doc.add(p);


            int length = table_rows.length;
            PdfPTable table = new PdfPTable(length);
            table.setSpacingBefore(10f);
            table.setHorizontalAlignment(Element.ALIGN_CENTER);

            for (int i = 0; i < length; i++) {
                table.addCell(new PdfPCell(new Phrase(table_rows[i], urFontName_bold)));
            }

            SQLiteDatabase database = db.getWritableDatabase();
            Cursor cursor = database.query(true, table_name, table_rows, null, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                do {
                    for (int i = 0; i < length; i++) {
                        table.addCell(new PdfPCell(new Phrase(cursor.getString(cursor.getColumnIndex(table_rows[i])), urFontName_bold)));
                    }
                } while (cursor.moveToNext());
            }
            cursor.close();
            doc.add((Element) table);
            Toasty.info(ViewTable.this, "Файли шумо дар папкаи Download/Dehqon/" + file_name + " сабт шуд", Toasty.LENGTH_LONG, true).show();

        } catch (DocumentException de) {
            Log.e("PDFCreator", "DocumentException:" + de);
        } catch (IOException e) {
            Log.e("PDFCreator", "ioException:" + e);
        } finally {
            doc.close();
            db.close();
        }
    }

    public void generate_pdf(View view) {
        String file_name = getIntent().getExtras().getString("file_name");
        String table_name = getIntent().getExtras().getString("table_name");
        String[] table_rows = getIntent().getExtras().getStringArray("table_rows");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        createPDF(file_name, table_name, table_rows);
    }
}