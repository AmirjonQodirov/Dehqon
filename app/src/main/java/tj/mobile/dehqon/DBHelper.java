package tj.mobile.dehqon;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "AppDB";

    public static final String TABLE_1 = "Механическая_работа";
    public static final String TABLE_2 = "Ручная_работа";
    public static final String TABLE_3 = "Использование_удобрений";
    public static final String TABLE_4 = "Ирригационные_работы";
    public static final String TABLE_5 = "Интегрированная_защита_растений";
    public static final String TABLE_6 = "Использование_СЗР";
    public static final String TABLE_7 = "Сбор_урожая";
    public static final String TABLE_8 = "Корректирующие_действия";
    public static final String TABLE_9 = "Обучение_персонала";
    public static final String TABLE_10 = "Жалобы_и_предложения";
    public static final String TABLE_11 = "Отзыв_продукции";
    public static final String TABLE_12 = "Складской_учет_хранения_СЗР";
    public static final String TABLE_13 = "Складской_учет_хранения_удобрений";
    public static final String TABLE_14 = "Послеуборочная_обработка";
    public static final String TABLE_15 = "Очистка_защитной_спецодежды";

    public static final String TABLE_1_KEY_ID = "_id";
    public static final String TABLE_1_row1 = "участок";
    public static final String TABLE_1_row2 = "дата";
    public static final String TABLE_1_row3 = "деятельность";
    public static final String TABLE_1_row4 = "исполнитель";
    public static final String TABLE_1_row5 = "отв_лицо";
    public static final String TABLE_1_row6 = "расход";

    public static final String TABLE_2_KEY_ID  = "_id";
    public static final String TABLE_2_row1 = "участок";
    public static final String TABLE_2_row2 = "дата";
    public static final String TABLE_2_row3 = "деятельность";
    public static final String TABLE_2_row4 = "исполнитель";
    public static final String TABLE_2_row5 = "отв_лицо";
    public static final String TABLE_2_row6 = "расход";

    public static final String TABLE_3_KEY_ID = "_id";
    public static final String TABLE_3_row1 = "участок";
    public static final String TABLE_3_row2 = "дата";
    public static final String TABLE_3_row3 = "наз_удобрения";
    public static final String TABLE_3_row4 = "акт_вещество";
    public static final String TABLE_3_row5 = "количество";
    public static final String TABLE_3_row6 = "концентрация";
    public static final String TABLE_3_row7 = "метод";
    public static final String TABLE_3_row8 = "исполнитель";
    public static final String TABLE_3_row9 = "отв_лицо";
    public static final String TABLE_3_row10 = "расход";

    public static final String TABLE_4_KEY_ID = "_id";
    public static final String TABLE_4_row1 = "участок";
    public static final String TABLE_4_row2 = "дата";
    public static final String TABLE_4_row3 = "количество";
    public static final String TABLE_4_row4 = "метод";
    public static final String TABLE_4_row5 = "период";
    public static final String TABLE_4_row6 = "исполнитель";
    public static final String TABLE_4_row7 = "отв_лицо";
    public static final String TABLE_4_row8 = "расход";

    public static final String TABLE_5_KEY_ID  = "_id";
    public static final String TABLE_5_row1 = "участок";
    public static final String TABLE_5_row2 = "дата";
    public static final String TABLE_5_row3 = "деятельность";
    public static final String TABLE_5_row4 = "исполнитель";
    public static final String TABLE_5_row5 = "отв_лицо";
    public static final String TABLE_5_row6 = "расход";

    public static final String TABLE_6_KEY_ID  = "_id";
    public static final String TABLE_6_row1 = "участок";
    public static final String TABLE_6_row2 = "дата";
    public static final String TABLE_6_row3 = "наз_болезни";
    public static final String TABLE_6_row4 = "наз_сзр";
    public static final String TABLE_6_row5 = "акт_вещество";
    public static final String TABLE_6_row6 = "кол_сзр";
    public static final String TABLE_6_row7 = "пропорции";
    public static final String TABLE_6_row8 = "метод_наз_оборуд";
    public static final String TABLE_6_row9 = "погода_темп_ветер";
    public static final String TABLE_6_row10 = "исполнитель";
    public static final String TABLE_6_row11 = "отв_лицо";
    public static final String TABLE_6_row12 = "ремананция";
    public static final String TABLE_6_row13 = "расход";

    public static final String TABLE_7_KEY_ID = "_id";
    public static final String TABLE_7_row1 = "участок";
    public static final String TABLE_7_row2 = "дата";
    public static final String TABLE_7_row3 = "исполнитель";
    public static final String TABLE_7_row4 = "объем";
    public static final String TABLE_7_row5 = "качество_и_сорт";
    public static final String TABLE_7_row6 = "отв_лицо";
    public static final String TABLE_7_row7 = "покупатель_и_номер";
    public static final String TABLE_7_row8 = "расход";

    public static final String TABLE_8_KEY_ID = "_id";
    public static final String TABLE_8_row1 = "дата_выявления";
    public static final String TABLE_8_row2 = "несоответствие";
    public static final String TABLE_8_row3 = "корректирующие_действия";
    public static final String TABLE_8_row4 = "дата_закрытия";
    public static final String TABLE_8_row5 = "отв_лицо";
    public static final String TABLE_8_row6 = "подпись";
    public static final String TABLE_8_row7 = "расходы";

    public static final String TABLE_9_KEY_ID = "_id";
    public static final String TABLE_9_row1 = "дата";
    public static final String TABLE_9_row2 = "тема";
    public static final String TABLE_9_row3 = "слушатель";
    public static final String TABLE_9_row4 = "должность";
    public static final String TABLE_9_row5 = "подпись_слушателья";
    public static final String TABLE_9_row6 = "тренер";
    public static final String TABLE_9_row7 = "подпись_тренера";
    public static final String TABLE_9_row8 = "расходы";

    public static final String TABLE_10_KEY_ID = "_id";
    public static final String TABLE_10_row1 = "дата";
    public static final String TABLE_10_row2 = "истец";
    public static final String TABLE_10_row3 = "контакты";
    public static final String TABLE_10_row4 = "жалобы";
    public static final String TABLE_10_row5 = "принятые_меры";
    public static final String TABLE_10_row6 = "ответ_лицо";

    public static final String TABLE_11_KEY_ID = "_id";
    public static final String TABLE_11_row1 = "дата";
    public static final String TABLE_11_row2 = "партия";
    public static final String TABLE_11_row3 = "наз_продукта";
    public static final String TABLE_11_row4 = "откуда";
    public static final String TABLE_11_row5 = "причина";
    public static final String TABLE_11_row6 = "ответ_лицо";
    public static final String TABLE_11_row7 = "расходы";

    public static final String TABLE_12_KEY_ID = "_id";
    public static final String TABLE_12_row1 = "дата_покупки";
    public static final String TABLE_12_row2 = "наз_сзр";
    public static final String TABLE_12_row3 = "сопр_документы";
    public static final String TABLE_12_row4 = "дата_расхода";
    public static final String TABLE_12_row5 = "кол_расхода";
    public static final String TABLE_12_row6 = "ответ_лицо";

    public static final String TABLE_13_KEY_ID = "_id";
    public static final String TABLE_13_row1 = "дата_покупки";
    public static final String TABLE_13_row2 = "наз_сзр";
    public static final String TABLE_13_row3 = "сопр_документы";
    public static final String TABLE_13_row4 = "дата_расхода";
    public static final String TABLE_13_row5 = "кол_расхода";
    public static final String TABLE_13_row6 = "ответ_лицо";

    public static final String TABLE_14_KEY_ID = "_id";
    public static final String TABLE_14_row1 = "дата";
    public static final String TABLE_14_row2 = "продукция";
    public static final String TABLE_14_row3 = "количество";
    public static final String TABLE_14_row4 = "детельность";
    public static final String TABLE_14_row5 = "консервант";
    public static final String TABLE_14_row6 = "кол_консервантов";
    public static final String TABLE_14_row7 = "время_начала";
    public static final String TABLE_14_row8 = "время_конца";
    public static final String TABLE_14_row9 = "ответ_лицо";
    public static final String TABLE_14_row10 = "расходы";

    public static final String TABLE_15_KEY_ID = "_id";
    public static final String TABLE_15_row1 = "дата";
    public static final String TABLE_15_row2 = "проведение_чистки_защитной_спецодежды ";
    public static final String TABLE_15_row3 = "фио_оператора";
    public static final String TABLE_15_row4 = "подпись";
    public static final String TABLE_15_row5 = "фио_овт_лица";
    public static final String TABLE_15_row6 = "подпись";

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //1
        db.execSQL("create table " + TABLE_1 + "("
                + TABLE_1_KEY_ID + " integer primary key, "
                + TABLE_1_row1 +" text, "+ TABLE_1_row2 +" text, "
                + TABLE_1_row3 +" text, "+ TABLE_1_row4 +" text, "
                + TABLE_1_row5 +" text, " + TABLE_1_row6 +" text)");
        //2
        db.execSQL("create table " + TABLE_2 + "("
                + TABLE_2_KEY_ID + " integer primary key, "
                + TABLE_2_row1 +" text, "+ TABLE_2_row2 +" text, "
                + TABLE_2_row3 +" text, "+ TABLE_2_row4 +" text, "
                + TABLE_2_row5 +" text, " + TABLE_2_row6 +" text)");
        //3
        db.execSQL("create table " + TABLE_3 + "("
                + TABLE_3_KEY_ID + " integer primary key, "
                + TABLE_3_row1 +" text, "+ TABLE_3_row2 +" text, "
                + TABLE_3_row3 +" text, "+ TABLE_3_row4 +" text, "
                + TABLE_3_row5 +" text, "+ TABLE_3_row6 +" text, "
                + TABLE_3_row7 +" text, "+ TABLE_3_row8 +" text, "
                + TABLE_3_row9 +" text, " + TABLE_3_row10 +" text)");
        //4
        db.execSQL("create table " + TABLE_4 + "("
                + TABLE_4_KEY_ID + " integer primary key, "
                + TABLE_4_row1 +" text, "+ TABLE_4_row2 +" text, "
                + TABLE_4_row3 +" text, "+ TABLE_4_row4 +" text, "
                + TABLE_4_row5 +" text, "+ TABLE_4_row6 +" text, "
                + TABLE_4_row7 +" text, " + TABLE_4_row8 +" text)");
        //5
        db.execSQL("create table " + TABLE_5 + "("
                + TABLE_5_KEY_ID + " integer primary key, "
                + TABLE_5_row1 +" text, "+ TABLE_5_row2 +" text, "
                + TABLE_5_row3 +" text, "+ TABLE_5_row4 +" text, "
                + TABLE_5_row5 +" text, " + TABLE_5_row6 +" text)");
        //6
        db.execSQL("create table " + TABLE_6 + "("
                + TABLE_6_KEY_ID + " integer primary key, "
                + TABLE_6_row1 +" text, "+ TABLE_6_row2 +" text, "
                + TABLE_6_row3 +" text, "+ TABLE_6_row4 +" text, "
                + TABLE_6_row5 +" text, "+ TABLE_6_row6 +" text, "
                + TABLE_6_row7 +" text, "+ TABLE_6_row8 +" text, "
                + TABLE_6_row9 +" text, "+ TABLE_6_row10 +" text, " + TABLE_6_row11 +" text, "
                + TABLE_6_row12 +" text, " + TABLE_6_row13 +" text)");
        //7
        db.execSQL("create table " + TABLE_7 + "("
                + TABLE_7_KEY_ID + " integer primary key, "
                + TABLE_7_row1 +" text, "+ TABLE_7_row2 +" text, "
                + TABLE_7_row3 +" text, "+ TABLE_7_row4 +" text, "
                + TABLE_7_row5 +" text, "+ TABLE_7_row6 +" text, "
                + TABLE_7_row7 +" text, " + TABLE_7_row8 +" text)");
        //8
        db.execSQL("create table " + TABLE_8 + "("
                + TABLE_8_KEY_ID + " integer primary key, "
                + TABLE_8_row1 +" text, "+ TABLE_8_row2 +" text, "
                + TABLE_8_row3 +" text, "+ TABLE_8_row4 +" text, "+ TABLE_8_row5 +" text, "
                + TABLE_8_row6 +" text, " + TABLE_8_row7 +" text)");
        //9
        db.execSQL("create table " + TABLE_9 + "("
                + TABLE_9_KEY_ID + " integer primary key, "
                + TABLE_9_row1 +" text, "+ TABLE_9_row2 +" text, "
                + TABLE_9_row3 +" text, "+ TABLE_9_row4 +" text, "
                + TABLE_9_row5 +" text, "+ TABLE_9_row6 +" text, "
                + TABLE_9_row7 +" text, " + TABLE_9_row8 +" text)");
        //10
        db.execSQL("create table " + TABLE_10 + "("
                + TABLE_10_KEY_ID + " integer primary key, "
                + TABLE_10_row1 +" text, "+ TABLE_10_row2 +" text, "
                + TABLE_10_row3 +" text, "+ TABLE_10_row4 +" text, "
                + TABLE_10_row5 +" text, " + TABLE_10_row6 +" text)");
        //11
        db.execSQL("create table " + TABLE_11 + "("
                + TABLE_11_KEY_ID + " integer primary key, "
                + TABLE_11_row1 +" text, "+ TABLE_11_row2 +" text, "
                + TABLE_11_row3 +" text, "+ TABLE_11_row4 +" text, "+ TABLE_11_row5 +" text, "
                + TABLE_11_row6 +" text, " + TABLE_11_row7 +" text)");
        //12
        db.execSQL("create table " + TABLE_12 + "("
                + TABLE_12_KEY_ID + " integer primary key, "
                + TABLE_12_row1 +" text, "+ TABLE_12_row2 +" text, "
                + TABLE_12_row3 +" text, "+ TABLE_12_row4 +" text, "
                + TABLE_12_row5 +" text, " + TABLE_12_row6 +" text)");
        //13
        db.execSQL("create table " + TABLE_13 + "("
                + TABLE_13_KEY_ID + " integer primary key, "
                + TABLE_13_row1 +" text, "+ TABLE_13_row2 +" text, "
                + TABLE_13_row3 +" text, "+ TABLE_13_row4 +" text, "
                + TABLE_13_row5 +" text, " + TABLE_13_row6 +" text)");
        //14
        db.execSQL("create table " + TABLE_14 + "("
                + TABLE_14_KEY_ID + " integer primary key, "
                + TABLE_14_row1 +" text, "+ TABLE_14_row2 +" text, "
                + TABLE_14_row3 +" text, "+ TABLE_14_row4 +" text, "
                + TABLE_14_row5 +" text, "+ TABLE_14_row6 +" text, "
                + TABLE_14_row7 +" text, "+ TABLE_14_row8 +" text, "
                + TABLE_14_row9 +" text, " + TABLE_14_row10 +" text)");
        //15
        db.execSQL("create table " + TABLE_15 + "("
                + TABLE_15_KEY_ID + " integer primary key, "
                + TABLE_15_row1 +" text, "+ TABLE_15_row2 +" text, "
                + TABLE_15_row3 +" text, "+ TABLE_15_row4 +" text, "
                + TABLE_15_row5 +" text, " + TABLE_15_row6 +" text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_1);
        onCreate(db);
    }
}
