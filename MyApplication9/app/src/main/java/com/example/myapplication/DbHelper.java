package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public static final String DBNAME="Login.db";

    public DbHelper(@Nullable Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase Mydb) {
        Mydb.execSQL("create table users(username TEXT primary key,password TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase Mydb, int i, int i1) {

        Mydb.execSQL("drop Table if exists users");

    }

    public Boolean insertdata(String username,String password){
        SQLiteDatabase Mydb=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password",password);
        long result=Mydb.insert("users",null,contentValues);
        if(result==1){
            return  false;
        }
        else {
            return true;
        }

    }

    public Boolean chechusername(String username){
        SQLiteDatabase Mydb=this.getWritableDatabase();
        Cursor cursor=Mydb.rawQuery("Select * from users where username = ?",new String[] {username});
        if (cursor.getCount()>0){
            return true;
        }else {
            return false;
        }
    }

    public Boolean chechusernamepassword(String username,String password){
        SQLiteDatabase Mydb=this.getWritableDatabase();
        Cursor cursor=Mydb.rawQuery("Select * from users where username = ? and password = ?",new String[] {username,password});
        if (cursor.getCount()>0){
            return true;
        }else {
            return false;
        }
    }
}
