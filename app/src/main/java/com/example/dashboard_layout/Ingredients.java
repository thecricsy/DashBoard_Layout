package com.example.dashboard_layout;

import android.database.Cursor;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.model.Ingredient;

import java.util.ArrayList;

public class Ingredients extends AppCompatActivity {
    ArrayList<Ingredient> ingredientArrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        linkViews();
        getDataFromDB();
    }

    private void linkViews() {
    }

    private void getDataFromDB() {
        Cursor cursor = MainActivity.database.getData("SELECT * FROM Ingredient");
        while (cursor.moveToNext()){
            ingredientArrayList.add(new Ingredient(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getInt(3)));
        }
        cursor.close();
    }
}
