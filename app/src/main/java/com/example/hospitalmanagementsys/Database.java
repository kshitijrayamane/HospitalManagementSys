package com.example.hospitalmanagementsys;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import static android.icu.lang.UProperty.AGE;
import static android.provider.Settings.NameValueTable.NAME;
import static android.provider.Telephony.TextBasedSmsColumns.ADDRESS;

public class Database extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME = "Hospitaldb.db";
    public static final String TABLE_NAME = "Patient_table";
    public static final String NAME = "Name";
    public static final String ADDRESS = "Address";
    public static final String MOBILE_NO = "Mobile_No";
    public static final String AGE = "Age";
    public static final String EMAIL_ID = "email_id";
    public static final String PASSWORD = "password";

    public Database(Context context)
    {
        super(context,DATABASE_NAME, null, 1);
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public boolean insertData(SQLiteDatabase db, int old, int newVer)
    {
        db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME, NAME);
        contentValues.put(ADDRESS, ADDRESS);
        contentValues.put(MOBILE_NO,Integer.parseInt(MOBILE_NO));
        contentValues.put(AGE,Integer.parseInt(AGE));
        contentValues.put(EMAIL_ID, EMAIL_ID);
        contentValues.put(PASSWORD, PASSWORD);
        long result = db.insert(TABLE_NAME,null,contentValues);
        if(result == -1)
            return  false;
        else
            return true;
    }
    public boolean updateData(SQLiteDatabase db, String id)
    {
        db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME, NAME);
        contentValues.put(ADDRESS, ADDRESS);
        contentValues.put(MOBILE_NO,Integer.parseInt(MOBILE_NO));
        contentValues.put(AGE, Integer.parseInt(AGE));
        contentValues.put(EMAIL_ID, EMAIL_ID);
        contentValues.put(PASSWORD,PASSWORD);
        db.update(TABLE_NAME, contentValues, "ID = ?", new String[]{ id });
        return true;
    }
    public Integer deleteData(String id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ? " , new String[]{id});
    }
    public Cursor getAllData()
    {
      SQLiteDatabase  db = this.getWritableDatabase();
      Cursor res = db.rawQuery("select * from " + TABLE_NAME,null);
      return res;
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,ADDRESS TEXT,MOBILE_NO INTEGER,AGE INTEGER,EMAIL_ID TEXT,PASSWORD TEXT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int old, int newVer)
    {
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        onCreate(db);
    }
}
