package com.example.dashboard_layout;

import android.database.Cursor;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.model.Save;

import java.util.ArrayList;

public class Saves extends AppCompatActivity{
    ArrayList<Save> saveArrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        linkViews();
        getDataFromDB();
    }

    private void linkViews() {
    }

    private void getDataFromDB() {
        Cursor cursor = MainActivity.database.getData("SELECT * FROM Save");
        while (cursor.moveToNext()) {
            saveArrayList.add(new Save(cursor.getString(0), cursor.getInt(1), cursor.getInt(2)));
        }
        cursor.close();
    }
}
