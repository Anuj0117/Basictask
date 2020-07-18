package com.example.basictask;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Mydb extends SQLiteOpenHelper {
    Context context;
    SQLiteDatabase sqLiteDatabase;
    public Mydb(Context context) {
        super(context, "infor.db", null, 3);
        this.context=context;
        sqLiteDatabase=getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqldb) {
        sqldb.execSQL("Create table data (Name text,Mobile text, Location text,Password text,Blood_grp text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqldb, int oldVersion, int newVersion) {

    }
    public  void  getandsave(String nam,String mob,String loc,String pass,String bldgrp){

        ContentValues contentValues=new ContentValues();
        contentValues.put("Name",nam);
        contentValues.put("Mobile",mob);
        contentValues.put("Location",loc);
        contentValues.put("Password",pass);
        contentValues.put("Blood_grp",bldgrp);
        sqLiteDatabase.insert("data",null,contentValues);


    }


    public String check(String s1) {
        Cursor cursor=sqLiteDatabase.query("data",null,"Name=?",new String[]{s1},null,null,null);
        if (cursor.getCount()<1){
            return  "not exist";
        }
        cursor.moveToFirst();
        String passdata=cursor.getString(cursor.getColumnIndex("Password"));
        return passdata;


    }
}
