package com.example.dashboard_layout;

import android.database.Cursor;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.model.Account;

import java.util.ArrayList;

public class Accounts extends AppCompatActivity {
    ArrayList<Account> accountArrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        linkViews();
        getDataFromDB();
    }

    private void linkViews() {
    }

    private void getDataFromDB() {
        Cursor cursor = MainActivity.database.getData("SELECT * FROM Account");
        while (cursor.moveToNext()){
            accountArrayList.add(new Account(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getInt(5),cursor.getBlob(6)));
        }
        cursor.close();
    }
}