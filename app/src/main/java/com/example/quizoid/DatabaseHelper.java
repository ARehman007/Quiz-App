package com.example.quizoid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String  DatabaseName = "zain.db";
    private static final String TableName = "Students_Record";
    private static final String COL1 = "Name";
    private static final String COL2 = "Registration";
    private static final String COL3 = "Percentage";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DatabaseName , null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE "+ TableName + "(Name TEXT PRIMARY KEY, " +
                " Registration TEXT , Percentage TEXT )";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ TableName);
        onCreate(db);
    }
    public boolean AddData(String name, String REG_NO , String percentage){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1 , name);
        contentValues.put(COL2 , REG_NO);
        contentValues.put(COL3 , percentage);
        long result = db.insert(TableName , null , contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }
    public Cursor showData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM "+TableName, null);
        return data;
    }

}
