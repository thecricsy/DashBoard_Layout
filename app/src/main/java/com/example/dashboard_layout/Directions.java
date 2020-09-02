package com.example.dashboard_layout;

import android.database.Cursor;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.model.Direction;

import java.util.ArrayList;

public class Directions extends AppCompatActivity {
    ArrayList<Direction> directionArrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        
        linkViews();
        getDataFromDB();
    }

    private void linkViews() {
    }

    private void getDataFromDB() {
        Cursor cursor = MainActivity.database.getData("SELECT * FROM Direction");
        while (cursor.moveToNext()){
            directionArrayList.add(new Direction(cursor.getInt(0),cursor.getString(1),cursor.getBlob(2),cursor.getInt(3),cursor.getInt(4)));
        }
        cursor.close();
    }
}
