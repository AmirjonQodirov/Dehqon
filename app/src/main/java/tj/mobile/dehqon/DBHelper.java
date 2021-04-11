package tj.mobile.dehqon;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "AppDB";

    public static final String TABLE_1 = "Корҳои_механикӣ";
    public static final String TABLE_2 = "Корҳои_дастӣ";
    public static final String TABLE_3 = "Истифодабарии_нуриҳо";
    public static final String TABLE_4 = "Обмонӣ";
    public static final String TABLE_5 = "Муҳофизати_интегратсионнии_растанӣ";
    public static final String TABLE_6 = "Истифодабарии_заҳрхимикатҳо";
    public static final String TABLE_7 = "Ҷамъоварии_ҳосил";
    public static final String TABLE_8 = "Корӽои_ислоӽотӣ";
    public static final String TABLE_9 = "Омӯзиш";
    public static final String TABLE_10 = "Арзу_шикоят";
    public static final String TABLE_11 = "Баргардонидани_маӽсулот";
    public static final String TABLE_12 = "Ҳисоботи_нигоӽдории_заӽрхимикатӽо";
    public static final String TABLE_13 = "Ҳисоботи_нигоӽдории_нуриӽо";
    public static final String TABLE_14 = "Коркарди_маӽсулот";
    public static final String TABLE_15 = "Тозза_намудани_либоси_махсуси_муҳофизатӣ";

    public static final String TABLE_1_KEY_ID = "_id";
    public static final String TABLE_1_row1 = "Қитъа";
    public static final String TABLE_1_row2 = "Сана";
    public static final String TABLE_1_row3 = "Фаъолият";
    public static final String TABLE_1_row4 = "Иҷрокунанда";
    public static final String TABLE_1_row5 = "Шахси_масъул";
    public static final String TABLE_1_row6 = "Хароҷот";

    public static final String TABLE_2_KEY_ID  = "_id";
    public static final String TABLE_2_row1 = "Қитъа";
    public static final String TABLE_2_row2 = "Сана";
    public static final String TABLE_2_row3 = "Фаъолият";
    public static final String TABLE_2_row4 = "Иҷрокунанда";
    public static final String TABLE_2_row5 = "Шахси_масъул";
    public static final String TABLE_2_row6 = "Хароҷот";

    public static final String TABLE_3_KEY_ID = "_id";
    public static final String TABLE_3_row1 = "Қитъа";
    public static final String TABLE_3_row2 = "Сана";
    public static final String TABLE_3_row3 = "Номи_нурӣ";
    public static final String TABLE_3_row4 = "Моддаи_активӣ";
    public static final String TABLE_3_row5 = "Миқдор";
    public static final String TABLE_3_row6 = "Консентрасия";
    public static final String TABLE_3_row7 = "Метод";
    public static final String TABLE_3_row8 = "Иҷрокунанда";
    public static final String TABLE_3_row9 = "Шахси_масъул";
    public static final String TABLE_3_row10 = "Хароҷот";

    public static final String TABLE_4_KEY_ID = "_id";
    public static final String TABLE_4_row1 = "Қитъа";
    public static final String TABLE_4_row2 = "Сана";
    public static final String TABLE_4_row3 = "Миқдор";
    public static final String TABLE_4_row4 = "Метод";
    public static final String TABLE_4_row5 = "Муддат";
    public static final String TABLE_4_row6 = "Иҷрокунанда";
    public static final String TABLE_4_row7 = "Шахси_масъул";
    public static final String TABLE_4_row8 = "Хароҷот";

    public static final String TABLE_5_KEY_ID  = "_id";
    public static final String TABLE_5_row1 = "Қитъа";
    public static final String TABLE_5_row2 = "Сана";
    public static final String TABLE_5_row3 = "Фаъолият";
    public static final String TABLE_5_row4 = "Иҷрокунанда";
    public static final String TABLE_5_row5 = "Шахси_масъул";
    public static final String TABLE_5_row6 = "Хароҷот";

    public static final String TABLE_6_KEY_ID  = "_id";
    public static final String TABLE_6_row1 = "Қитъа";
    public static final String TABLE_6_row2 = "Сана";
    public static final String TABLE_6_row3 = "Номи_касали";
    public static final String TABLE_6_row4 = "Номи_захрхимикат";
    public static final String TABLE_6_row5 = "Моддаи_фаъол";
    public static final String TABLE_6_row6 = "Миқдори_захрхимикат";
    public static final String TABLE_6_row7 = "Миқдори_омехтакунӣ";
    public static final String TABLE_6_row8 = "Метод_ва_номи_таҷҳизот";
    public static final String TABLE_6_row9 = "Боду_ҳаво_ҳарорат_ва_самти_шамол";
    public static final String TABLE_6_row10 = "Иҷрокунанда";
    public static final String TABLE_6_row11 = "Шахси_масъул";
    public static final String TABLE_6_row12 = "Санаи_боздошт";
    public static final String TABLE_6_row13 = "Хароҷот";

    public static final String TABLE_7_KEY_ID = "_id";
    public static final String TABLE_7_row1 = "Қитъа";
    public static final String TABLE_7_row2 = "Сана";
    public static final String TABLE_7_row3 = "Иҷрокунанда";
    public static final String TABLE_7_row4 = "Миқдор";
    public static final String TABLE_7_row5 = "Сифат_ва_сорт";
    public static final String TABLE_7_row6 = "Шахси_масъул";
    public static final String TABLE_7_row7 = "Харидор_ва_рақами_мобилии_он";
    public static final String TABLE_7_row8 = "Хароҷот";

    public static final String TABLE_8_KEY_ID = "_id";
    public static final String TABLE_8_row1 = "Санаи_муайянкуни";
    public static final String TABLE_8_row2 = "Хатогӣ";
    public static final String TABLE_8_row3 = "Корӽои_ислоӽотӣ";
    public static final String TABLE_8_row4 = "Санаи_маӽкамкунӣ";
    public static final String TABLE_8_row5 = "Шахси_масъул";
    public static final String TABLE_8_row7 = "Хароҷот";

    public static final String TABLE_9_KEY_ID = "_id";
    public static final String TABLE_9_row1 = "Сана";
    public static final String TABLE_9_row2 = "Мавзӯъ";
    public static final String TABLE_9_row3 = "Шунаванда";
    public static final String TABLE_9_row4 = "Вазифа";
    public static final String TABLE_9_row6 = "Омӯзгор";
    public static final String TABLE_9_row8 = "Хароҷот";

    public static final String TABLE_10_KEY_ID = "_id";
    public static final String TABLE_10_row1 = "Сана";
    public static final String TABLE_10_row2 = "Шикояткунанда";
    public static final String TABLE_10_row3 = "Маълумот";
    public static final String TABLE_10_row4 = "Шикоят";
    public static final String TABLE_10_row5 = "Шикоят_андешидашуда";
    public static final String TABLE_10_row6 = "Шахси_масъул";

    public static final String TABLE_11_KEY_ID = "_id";
    public static final String TABLE_11_row1 = "Сана";
    public static final String TABLE_11_row2 = "Партия";
    public static final String TABLE_11_row3 = "Номи_маӽсулот";
    public static final String TABLE_11_row4 = "Аз_куҷо";
    public static final String TABLE_11_row5 = "Сабаб";
    public static final String TABLE_11_row6 = "Шахси_масъул";
    public static final String TABLE_11_row7 = "Хароҷот";

    public static final String TABLE_12_KEY_ID = "_id";
    public static final String TABLE_12_row1 = "Сана_покупки";
    public static final String TABLE_12_row2 = "Номи_заӽрхимикат";
    public static final String TABLE_12_row3 = "Ӽуҷҷатӽои_тасдиқкунанда";
    public static final String TABLE_12_row4 = "Сана_Хароҷота";
    public static final String TABLE_12_row5 = "Миқдор";
    public static final String TABLE_12_row6 = "Шахси_масъул";

    public static final String TABLE_13_KEY_ID = "_id";
    public static final String TABLE_13_row1 = "Санаи_харид";
    public static final String TABLE_13_row2 = "Номи_нурӣ";
    public static final String TABLE_13_row3 = "Ӽуҷҷатӽои_тасдиқкунанда";
    public static final String TABLE_13_row4 = "Санаи_истифодабари";
    public static final String TABLE_13_row5 = "Миқдор";
    public static final String TABLE_13_row6 = "Шахси_масъул";

    public static final String TABLE_14_KEY_ID = "_id";
    public static final String TABLE_14_row1 = "Сана";
    public static final String TABLE_14_row2 = "Маӽсулот";
    public static final String TABLE_14_row3 = "Миқдор";
    public static final String TABLE_14_row4 = "Фаъолият";
    public static final String TABLE_14_row5 = "Консервант";
    public static final String TABLE_14_row6 = "Миқдори_консервант";
    public static final String TABLE_14_row7 = "Вақти_саршави";
    public static final String TABLE_14_row8 = "Вақти_охир";
    public static final String TABLE_14_row9 = "Шахси_масъул";
    public static final String TABLE_14_row10 = "Хароҷот";

    public static final String TABLE_15_KEY_ID = "_id";
    public static final String TABLE_15_row1 = "Сана";
    public static final String TABLE_15_row2 = "Тозза_намуданилибоси_махсуси_муҳофизатӣ ";
    public static final String TABLE_15_row3 = "Ному_насаби_коргар";
    public static final String TABLE_15_row5 = "Ному_насаби_шахси_масъул";

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
                + TABLE_8_row7 +" text)");
        //9
        db.execSQL("create table " + TABLE_9 + "("
                + TABLE_9_KEY_ID + " integer primary key, "
                + TABLE_9_row1 +" text, "+ TABLE_9_row2 +" text, "
                + TABLE_9_row3 +" text, "+ TABLE_9_row4 +" text, "
                + TABLE_9_row6 +" text, "
                + TABLE_9_row8 +" text)");
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
                + TABLE_15_row3 +" text, "
                + TABLE_15_row5 +" text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_1);
        onCreate(db);
    }
}
