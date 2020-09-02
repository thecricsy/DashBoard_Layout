package com.example.dashboard_layout;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import androidx.annotation.Nullable;

public class Databases extends SQLiteOpenHelper {

    public Databases(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void queryData(String sql){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }

    public Cursor getData(String sql){
        SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(sql,null);
    }

    public void insertAccount(String email, String name, String dob, String password, int gender, byte[] avatar){
        SQLiteDatabase database = getWritableDatabase();
        String sql = "INSERT INTO Accounts VALUES(null,?,?,?,?,?,?)";
        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1,email);
        statement.bindString(2,name);
        statement.bindString(3,dob);
        statement.bindString(4,password);
        statement.bindLong(5,gender);
        statement.bindBlob(6,avatar);

        statement.executeInsert();
    }

    public void insertPost(String header, String intro, int serving, int prepTime, int cookTime, byte[] poster, String timeWriten, int accountId){
        SQLiteDatabase database = getWritableDatabase();
        String sql = "INSERT INTO Posts VALUES(null,?,?,?,?,?,?,?)";
        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1,header);
        statement.bindString(2,intro);
        statement.bindLong(3,serving);
        statement.bindLong(4,prepTime);
        statement.bindLong(5,cookTime);
        statement.bindString(6,timeWriten);
        statement.bindBlob(7,poster);
        statement.bindLong(8,accountId);

        statement.executeInsert();
    }

    public void insertDirection(String content, int number, byte[] picture, int postId){
        SQLiteDatabase database = getWritableDatabase();
        String sql = "INSERT INTO Directions VALUES(null,?,?,?)";
        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1,content);
        statement.bindLong(2,number);
        statement.bindBlob(3,picture);
        statement.bindLong(4,postId);

        statement.executeInsert();
    }

    public void insertIngredient(String ingredientName, String amount, int postId){
        SQLiteDatabase database = getWritableDatabase();
        String sql = "INSERT INTO Ingredients VALUES(null,?,?,?)";
        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1,ingredientName);
        statement.bindString(2,amount);
        statement.bindLong(3,postId);

        statement.executeInsert();
    }

}
